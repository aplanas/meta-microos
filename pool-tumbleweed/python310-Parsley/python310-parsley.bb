SUMMARY = "PEG algorithm based parser generator"
DESCRIPTION = "Parsley is a parsing library. Most parser generators like ANTLR and \
Bison are based on LL or LR parsing algorithms that compile to big \
state machine tables, whereas Parsley, like pyparsing and \
ZestyParser, uses the PEG algorithm, so each expression in the \
grammar rules works like a Python expression. In particular, \
alternatives are evaluated in order, unlike table-driven parsers such \
as yacc, bison or PLY. \
 \
The binaries are prefixed with parsley-."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "python310-Parsley-1.3-5.3.noarch.rpm"
RPM_HASH = "34522f7eb32dea1dc660d4f41ad340322fae115974d451f1ef23c999c470442dadead5a3a97bf469996bf6bb8010a8f288779c7f83908dd03e2b6cf415870a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parsley \
python310-Parsley \
python310-parsley \
python3dist-parsley"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
