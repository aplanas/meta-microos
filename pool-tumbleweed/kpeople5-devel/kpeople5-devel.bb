SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them. \
Development files for kpeople5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kpeople5-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "62423a8b7fe17f129592218f98c8401ade94fb67ae103b0541588b8d4cc52eb911b1c8352714076d134629344706252c817252a84f42a9e6eb722420a54ef8f6"

RPROVIDES:${PN} += "cmake-KF5People \
kpeople5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
kpeople5"

inherit rpm
