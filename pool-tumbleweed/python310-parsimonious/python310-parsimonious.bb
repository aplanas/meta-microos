SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-parsimonious-0.10.0-1.4.noarch.rpm"
RPM_HASH = "a2607eb3a00f3b0a7678fa027414dfab7ba069ea67e1a835174f1ed2b9c420df4d4230a497009d47db6e24b7ff8af38d04f0cc85d75b6cc5836d7ff55db0bdff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-parsimonious \
python310-parsimonious \
python3dist-parsimonious"

RDEPENDS:${PN} += "python-abi \
python310-regex"

inherit rpm
