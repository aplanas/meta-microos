SUMMARY = "Python module for parsing and writing kickstart files"
DESCRIPTION = "Pykickstart is a Python library consisting of a data representation \
of kickstart files, a parser to read files into that representation, \
and a writer to generate kickstart files."
LICENSE = "GPL-2.0-only & MIT"

PV = "3.43"

RPM_NAME = "python39-pykickstart-3.43-2.2.noarch.rpm"
RPM_HASH = "a55be7a5e4e80e40115014caabea93c861ef6309633a0181392de718ae96985d0023b17e423ded7b9b018d02b38fa3526d2a4f63f3c2727c728ed6d9ed03d0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pykickstart) \
python39-pykickstart \
python3dist(pykickstart)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-requests"

inherit rpm
