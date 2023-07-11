SUMMARY = "Development package for kfilemetadata"
DESCRIPTION = "A library for extracting file metadata. Development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.107.0"

RPM_NAME = "kfilemetadata5-devel-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "e2af705363e4045432e7d41719d70057ed17ac96339396c024b13cfa9f06011dccea93adb17cc70b5700cc079bd9da0332fdddae0b61b6a8bf03bdf2776c2b23"

RPROVIDES:${PN} += "cmake-KF5FileMetaData \
kfilemetadata5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kfilemetadata5"

inherit rpm
