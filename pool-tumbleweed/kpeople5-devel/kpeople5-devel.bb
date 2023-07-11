SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them. \
Development files for kpeople5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kpeople5-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "f24ee9961e6af0b9806d9a40d3921c7f6015dcc4642005caed11b0e8663c29953329a2617b2e4f538edff80b33976935b8a0d6fe9cc40556caec1061383a456b"

RPROVIDES:${PN} += "cmake-KF5People \
kpeople5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
kpeople5"

inherit rpm
