SUMMARY = "Development files for the FreeIPA certmap library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libsss_certmap-devel-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "dca9343acba358febcf43d24e9dc6d58e43ddb03005fe032bc33ebf1327d60784c0aabe82a6464893f8b0b58f4f83de6fdda57bf9a638db58a0525eb69a4662e"

RPROVIDES:${PN} += "libsss-certmap-devel \
pkgconfig-sss-certmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-certmap0"

inherit rpm
