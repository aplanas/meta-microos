SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-parsimonious-0.10.0-1.4.noarch.rpm"
RPM_HASH = "38be0a2473d8f00567edc851cf963d774b4cb615aa6d0d95dcfd0576c1128babc4cbd2a475cc0bdfc0d84477831aee312fd6b7edf951f8a0215cf7f03769513f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsimonious \
python3.11dist-parsimonious \
python311-parsimonious \
python3dist-parsimonious"

RDEPENDS:${PN} += "python-abi \
python311-regex"

inherit rpm
