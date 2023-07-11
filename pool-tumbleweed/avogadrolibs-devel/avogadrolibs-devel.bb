SUMMARY = "Header files for Avogadro libraries"
DESCRIPTION = "Header files for Avogadro libraries."
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "avogadrolibs-devel-1.97.0-2.4.aarch64.rpm"
RPM_HASH = "4580a8f1b386c0f56df2a5a44a31ca1ec60b9332856a959e353b1388cb9bc4d8df2eb35105eb6131436545210ea8f34080838abd26a671a0a85c0d7f59112e12"

RPROVIDES:${PN} += "avogadrolibs-devel \
cmake-AvogadroLibs"

RDEPENDS:${PN} += "avogadrolibs-plugins \
cmake-MoleQueue \
cmake-Qt5Network \
cmake-Qt5Widgets \
libAvogadro1 \
pkgconfig-gl \
pkgconfig-glew"

inherit rpm
