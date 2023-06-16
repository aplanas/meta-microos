SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.43"

RPM_NAME = "python311-pykickstart-3.43-2.2.noarch.rpm"
RPM_HASH = "2fe7b654f37782a0da6ebb77a6d6212272db39386585d8fe036760e18c4b22fe8e229ee9786b44d858aa4e8b744f16b78f55456cdd3e0bc203fafbc71fb9f5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pykickstart \
python311-pykickstart \
python3dist-pykickstart"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-requests"

inherit rpm
