SUMMARY = "Meta-language for DSL implementation inspired by Xtext"
DESCRIPTION = "textX is a meta-language for building Domain-Specific Languages (DSLs) in Python. \
It is inspired by Xtext. \
 \
From a single language description (grammar), textX will build a \
parser and a meta-model (a.k.a. abstract syntax) for textual \
languages. Own languages can be invented or support for already \
existing textual language or file format be built. \
 \
textX follows the syntax and semantics of Xtext, but differs in some places \
and is implemented in Python using the Arpeggio PEG parser - no grammar \
ambiguities, unlimited lookahead, interpreter style of work."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-textX-3.0.0-1.10.noarch.rpm"
RPM_HASH = "056cc2380167d7b82c4af0329ff6a8b74ada5fed20f4a756a7bb59f6136036db86eca3b70bb23b4f57a5464393db1d0d06994e4a9aecc56b0f936d5613062199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textX \
python3.11dist-textx \
python311-textX \
python3dist-textx"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Arpeggio \
python311-click \
python311-future \
python311-setuptools \
update-alternatives"

inherit rpm
