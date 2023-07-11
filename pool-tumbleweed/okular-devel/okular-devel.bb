SUMMARY = "Development files for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in various formats"
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "okular-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "4b14a2e4777329b02e32b593c7ca355a94f5ed767cc6b2bcf8f89838d48ea3dd07d3b9556fc911b7f230538e7a062874e4144326494620472002e08cf17e4104"

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
