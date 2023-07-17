SUMMARY = "Development package for kfilemetadata"
DESCRIPTION = "A library for extracting file metadata. Development files"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.108.0"

RPM_NAME = "kfilemetadata5-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "eb2e16165552c69c645eea4bb72e77e2f905d914e9c7a9184010919e728642c14acf26bba0cef90c2413d4ea770bb3f238a55e736d47ee683e97305ffcb1f9a2"

RPROVIDES:${PN} += "cmake-KF5FileMetaData \
kfilemetadata5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
kfilemetadata5"

inherit rpm
