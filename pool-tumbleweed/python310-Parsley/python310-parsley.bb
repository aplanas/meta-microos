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

RPM_NAME = "python310-Parsley-1.3-5.1.noarch.rpm"
RPM_HASH = "83d15d6c46f00ab58dd5a4c019fb0fe44e9471eacf9418b4625beadbbaf26876befc6580a6fe87668b0c9cf4d8b9542d2dc3fdc26aa70f0d691c3b33c4bbaf55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Parsley \
python3-parsley \
python3.10dist-parsley \
python310-Parsley \
python310-parsley \
python3dist-parsley"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
