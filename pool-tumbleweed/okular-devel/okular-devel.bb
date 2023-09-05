SUMMARY = "Development files for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in various formats"
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "okular-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "61314661d94622525068aa5a199669c1e76e614737148504aabebc55fd6c049ef413bf6e0e14ef3ca52da1e53e60431bd5a6ea4198cbc814129c5a5a6da5b788"

RPROVIDES:${PN} += "cmake-Okular5 \
okular-devel \
okular5-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5CoreAddons \
cmake-KF5XmlGui \
cmake-Qt5Core \
cmake-Qt5PrintSupport \
cmake-Qt5Widgets \
libQt5Core-private-headers-devel \
okular"

inherit rpm
