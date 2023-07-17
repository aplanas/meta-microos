SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them. \
Development files for kpeople5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kpeople5-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "31504292862168154d0a7dff296dfcd41d0ebe1c1c0a515bd9fc17aaa4b6a1d1c5696375e1d7c4d040679b04004f4cff9f99f717628ff74f156871cbcae92a04"

RPROVIDES:${PN} += "cmake-KF5People \
kpeople5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
kpeople5"

inherit rpm
