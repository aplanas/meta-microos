SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-parsimonious-0.10.0-1.2.noarch.rpm"
RPM_HASH = "9a84d2ec02495e7beee59868fb97dad4390a79db9ba0b672e2b9ac565665ae4fb2f1151cde2e8950809ca8cca6766a78cdc7e0885bf66d413af8e4bad358bc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-parsimonious \
python311-parsimonious \
python3dist-parsimonious"

RDEPENDS:${PN} += "python-abi \
python311-regex"

inherit rpm
