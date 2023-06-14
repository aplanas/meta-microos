SUMMARY = "Development Files for remmina"
DESCRIPTION = "This package contains header files needed for developing plugins for \
Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-devel-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "6c61ab97b9c543f0806688f55e9303cc45311a7563a1ad2c04c5164ce54d7517f33ebe5931082601244c5abcb4601c89418191c28686eb3f88907ecb6224d182"

RPROVIDES:${PN} += "pkgconfig-remmina \
remmina-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
remmina"

inherit rpm
