SUMMARY = "Build environment for the KDE PIM MIME libraries"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kmime-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bd69bc501bb72203b1870e5a83a9a38fa08a05e85abc2f1f463f3ddf469dafc4a2c7c09c21d15988127eaf8edb8cafcea852f34475e8b986e80917d7eeb0a750"

RPROVIDES:${PN} += "cmake-KF5Mime \
cmake-KPim5Mime \
kmime-devel"

RDEPENDS:${PN} += "cmake-KF5Codecs \
libKPim5Mime5"

inherit rpm
