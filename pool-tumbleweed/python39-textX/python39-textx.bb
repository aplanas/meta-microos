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

RPM_NAME = "python39-textX-3.0.0-1.10.noarch.rpm"
RPM_HASH = "8a487e7528832ec529391c908eed60feb8b1d7861313fc91157d48772e38a04b31407455ff8c539cd575ce2aac828a4e4e8ae51153decd4da7d76382d0786e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-textx \
python39-textX \
python3dist-textx"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Arpeggio \
python39-click \
python39-future \
python39-setuptools \
update-alternatives"

inherit rpm
