SUMMARY = "Development files for the FreeIPA certmap library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "libsss_certmap-devel-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "e07cdfa967fdddffaf3668d5f5f83652c5b52093446955bf8cb2501c86786ad7aa303a6383991eb3835c1d72ae4017196febe5c681d6730feadadb2c850f0b4f"

RPROVIDES:${PN} += "libsss-certmap-devel \
pkgconfig-sss-certmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsss-certmap0"

inherit rpm
