SUMMARY = "Development package for kfilemetadata"
DESCRIPTION = "A library for extracting file metadata. Development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.109.0"

RPM_NAME = "kfilemetadata5-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "dd8e80e001a8b0b261abfc8aa4d1c684570b99ec5947961af239b16c2c53ebc145bb72c1b62c4b5cc6731d9acc2908a8bdac8adf0d626d71db07ab8ad8e55e9b"

RPROVIDES:${PN} += "cmake-KF5FileMetaData \
kfilemetadata5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kfilemetadata5"

inherit rpm
