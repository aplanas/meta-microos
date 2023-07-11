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

RPM_NAME = "python310-textX-3.0.0-1.10.noarch.rpm"
RPM_HASH = "7cebd0bdc66cb815b1d788f6a0e28a559aead08322a2429c129b16f07436625538f5c8b594baa33bcb0d6224f51414575a276d991672c36d6882867f36b6720a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-textx \
python310-textX \
python3dist-textx"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Arpeggio \
python310-click \
python310-future \
python310-setuptools \
update-alternatives"

inherit rpm
