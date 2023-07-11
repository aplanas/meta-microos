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

RPM_NAME = "python311-Parsley-1.3-5.3.noarch.rpm"
RPM_HASH = "059e4c46ef95d3e90260b34ab58607bb665ac97015bd30e13a396174db88d743b23cf4a777eeb072d89cf4911e4fd29f712f04d020d154b3fd3a1b84b481a1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Parsley \
python3-parsley \
python3.11dist-parsley \
python311-Parsley \
python311-parsley \
python3dist-parsley"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
