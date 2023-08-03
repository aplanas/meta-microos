SUMMARY = "Development files for libqb"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8+20230721.002171b"

RPM_NAME = "libqb-devel-2.0.8+20230721.002171b-1.1.aarch64.rpm"
RPM_HASH = "47e7312f2c8e650393bc4055f2413ae7906e2b9b8069ae04f0cdd089e0e9631924b64267eea1552bf28c3ee9088a0211af7b1e5ca07bf8545e5dc4434d19eddc"

RPROVIDES:${PN} += "libqb-devel \
pkgconfig-libqb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqb100"

inherit rpm
