SUMMARY = "A Computer algebra package for Lie group computations"
DESCRIPTION = "LiE is a computer algebra system that is specialised in computations \
involving (reductive) Lie groups and their representations. \
 \
This packlage provides documentation for LiE."
LICENSE = "LGPL-3.0+"

PV = "2.2.2"

RPM_NAME = "LiE-doc-2.2.2-6.31.aarch64.rpm"
RPM_HASH = "3a93d4141d3453d16f617555b055826a37833385e0b6fead1b140155128908c9ad557f2a0a4755a7cb8cff918bc3cdd1e0f5ee566713b7bdc56d9786f23fd1a0"

RPROVIDES:${PN} += "LiE-doc \
LiE-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
