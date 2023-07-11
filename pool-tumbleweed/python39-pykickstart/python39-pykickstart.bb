SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.43"

RPM_NAME = "python39-pykickstart-3.43-2.4.noarch.rpm"
RPM_HASH = "f3a28c674b620a72d71e1ce40dc3938d9aa9a73e94c9b2a8b3c66c7e40f5403e9fa78ef9ee81555a11fd644eb65c4525dc396bf921b1faa6f7429c61fafef7b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pykickstart \
python39-pykickstart \
python3dist-pykickstart"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-requests"

inherit rpm
