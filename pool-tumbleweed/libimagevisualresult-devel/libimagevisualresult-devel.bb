SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "The libimagevisualresult-devel package contains the header files and developer \
docs for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimagevisualresult-devel-1.0.24-1.2.aarch64.rpm"
RPM_HASH = "3dbb940e9ca5a286682e55e8b3bb7416603af8dae9b8f38814777b59ccb973624806932289297e487352db56fcf69051a29aebad5126dae5871f872d86396356"

RPROVIDES:${PN} += "libimagevisualresult-devel \
pkgconfig-libimagevisualresult"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libimagevisualresult0-1"

inherit rpm
