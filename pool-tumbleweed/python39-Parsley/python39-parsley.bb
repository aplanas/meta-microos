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

RPM_NAME = "python39-Parsley-1.3-5.3.noarch.rpm"
RPM_HASH = "63555426754f46d2b829a7c392c935578bcc1323e7d42dc1251ef94037f904bd4969c24d49754a8e0a244237431c65fed08867f1711ade87f9dfb12f8227c709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parsley \
python39-Parsley \
python39-parsley \
python3dist-parsley"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
