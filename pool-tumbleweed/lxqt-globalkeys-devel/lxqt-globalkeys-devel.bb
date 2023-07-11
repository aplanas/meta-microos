SUMMARY = "Development files for lxqt-globalkeys"
DESCRIPTION = "Development files for lxqt-globalkeys including headers and libraries"
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-globalkeys-devel-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "24e502941f1ac3eea4c23d51769523d1e6f48824fcabe7dad09b14b5afe97c9b8f7b4daa11f7190fc545c74fda08e811fbee5a3613ca36d4d54a4af0f6872f3c"

RPROVIDES:${PN} += "cmake-lxqt-globalkeys \
cmake-lxqt-globalkeys-ui \
lxqt-globalkeys-devel \
pkgconfig-lxqt-globalkeys \
pkgconfig-lxqt-globalkeys-ui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxqt-globalkeys-ui1 \
liblxqt-globalkeys1 \
lxqt-globalkeys \
pkgconfig \
pkgconfig-Qt5DBus \
pkgconfig-Qt5Widgets \
pkgconfig-lxqt-globalkeys"

inherit rpm
