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

RPM_NAME = "python39-Parsley-1.3-5.1.noarch.rpm"
RPM_HASH = "8ec16f41b547a86d77d02cfc3220bc93505f99495b246610a66457e92b15533d03cbc1825011332a8a279fb242635915d5b0b91bbfc6f297cb2ff86fa3894313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parsley \
python39-Parsley \
python39-parsley \
python3dist-parsley"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
update-alternatives"

inherit rpm
