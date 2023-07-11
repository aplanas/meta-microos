SUMMARY = "Development files for libsbc1"
DESCRIPTION = "Development files for the SBC library"
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "sbc-devel-1.5-2.12.aarch64.rpm"
RPM_HASH = "43a6bd92c7b1999d2d1ac1a4b278281ec7841b332f1ea3829915db9dd01cf3ec55ca7c6abe6e249cecb22df15c0a2c525b0f30a24c74cea633aa67b3a0cb8b65"

RPROVIDES:${PN} += "pkgconfig-sbc \
sbc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsbc1"

inherit rpm
