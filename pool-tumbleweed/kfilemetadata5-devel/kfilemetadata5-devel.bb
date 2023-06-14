SUMMARY = "Development package for kfilemetadata"
DESCRIPTION = "A library for extracting file metadata. Development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.106.0"

RPM_NAME = "kfilemetadata5-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "0a084e68e27652e09bb9a39ef685cab33bbbbe1947d42a99f6cc7b6de8c286da1df86c68a21164fa598509d144d459da2dd03276ff30bdafd206771fdbd4183e"

RPROVIDES:${PN} += "cmake-KF5FileMetaData \
kfilemetadata5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kfilemetadata5"

inherit rpm
