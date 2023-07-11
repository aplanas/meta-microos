SUMMARY = "Development files for libiscsi"
DESCRIPTION = "Development files for libiscsi"
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.19.0+git.20230208"

RPM_NAME = "libiscsi-devel-1.19.0+git.20230208-1.4.aarch64.rpm"
RPM_HASH = "3c16e207c79dbc431245fd25e135e659a8959a58960beb20a41d807a5a2c28664983e564aebd820307ab1fbc5f64453a3c1c8a11af8123c33d44b9c98e668f72"

RPROVIDES:${PN} += "libiscsi-devel \
pkgconfig-libiscsi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libiscsi9"

inherit rpm
