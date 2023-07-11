SUMMARY = "Pure-Python PEG parser"
DESCRIPTION = "Parsimonious is an arbitrary-lookahead parser written in pure \
Python. It's based on parsing expression grammars (PEGs), which \
means you feed it a simplified sort of EBNF notation."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-parsimonious-0.10.0-1.4.noarch.rpm"
RPM_HASH = "0ffb8854d4d24f1a52f6ac578f199c864b49ab34fbd8205a4147312e94ab2aab25aa1a1aa96551f5e5de6b55f61aafa2bc71845695965b7316b99bebc1c4afcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parsimonious \
python39-parsimonious \
python3dist-parsimonious"

RDEPENDS:${PN} += "python-abi \
python39-regex"

inherit rpm
