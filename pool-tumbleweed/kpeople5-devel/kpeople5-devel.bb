SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them. \
Development files for kpeople5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kpeople5-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "cf56b66d2bc1a5d1a14667335831fdf3b86e80b05e6de988682551ef136ee57d7015ff7a1c1fd619d291a5a0fe8e02a3efefdb6b8f6c9484e8e29a553769b485"

RPROVIDES:${PN} += "cmake-KF5People \
kpeople5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
kpeople5"

inherit rpm
