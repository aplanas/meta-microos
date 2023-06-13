SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-parsimonious-0.10.0-1.2.noarch.rpm"
RPM_HASH = "a7b0a86153dbb52e804f7af4d5eaea7355ebc439b8c2d7faa4d19c39f902fbdb38671e4e8e7b600cd8b7676402be192946f80e2596d1e73a104d9632949d7111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsimonious \
python3.10dist(parsimonious) \
python310-parsimonious \
python3dist(parsimonious)"

RDEPENDS:${PN} += "python(abi) \
python310-regex"

inherit rpm
