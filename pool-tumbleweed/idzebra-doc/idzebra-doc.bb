SUMMARY = "Documentation for the idzebra Package"
DESCRIPTION = "This package contains the documentation for Zebra.  Zebra is a fielded \
free text indexing and retrieval engine with a Z39.50 front-end."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "idzebra-doc-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "efc674e7e8e58175172f6cbcc33087bf910ee1ec70bc9700d0139c11553fd7bc771166bab046b41574b054d81f40101028735eee111754a293595897e4576286"

RPROVIDES:${PN} += "idzebra-doc \
idzebra-doc(aarch-64)"

RDEPENDS:${PN} += "idzebra"

inherit rpm
