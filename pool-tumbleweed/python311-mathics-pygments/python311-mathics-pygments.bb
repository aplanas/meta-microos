SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-mathics-pygments-1.0.2-1.9.noarch.rpm"
RPM_HASH = "2bdb643aadd2ed35ddbf79483994c62a6c2a3a6281f9aa8c257685bf69305b4d9333597470758510ccf84b8142019319e5aa81b03ce7cb3ab40ca414a56e9ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mathics-pygments \
python3.11dist-mathics-pygments \
python311-mathics-pygments \
python3dist-mathics-pygments"

RDEPENDS:${PN} += "python-abi \
python311-Mathics-Scanner \
python311-Pygments"

inherit rpm
