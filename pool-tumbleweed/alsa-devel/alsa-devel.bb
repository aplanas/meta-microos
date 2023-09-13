SUMMARY = "Header files for ALSA development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require ALSA."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.10"

RPM_NAME = "alsa-devel-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "39a9182a4ac6e5b6b43995891b1ced75dcb043ca76979a54e820d152ae055d02cfa0d77649206d73e0f3360381ac0ac8ccb8279d2ef11e0c6d464e4ea70de475"

RPROVIDES:${PN} += "alsa-devel \
alsa-lib-devel \
alsadev \
pkgconfig-alsa"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libasound2"

inherit rpm
