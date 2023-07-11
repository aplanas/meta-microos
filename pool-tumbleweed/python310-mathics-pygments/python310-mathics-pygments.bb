SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-mathics-pygments-1.0.2-1.9.noarch.rpm"
RPM_HASH = "2cb00bd4188e3c0551c39484068df6fdb64b15d765874117c04db150609a3b6b776e18ae81b7c712c884092825b02ea19c14814323d9b55a6bce817d5e77797c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mathics-pygments \
python310-mathics-pygments \
python3dist-mathics-pygments"

RDEPENDS:${PN} += "python-abi \
python310-Mathics-Scanner \
python310-Pygments"

inherit rpm
