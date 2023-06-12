SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python311-mathics-pygments-1.0.2-1.7.noarch.rpm"
RPM_HASH = "bd3b33abfd8b4325127d08b162fc2eb32bf4ba525b5971b2ef16a3906bffe0318fe9e7779afd43ee01ec3958d12216819a5e5066b0c4892ddeda1abc043c3fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mathics-pygments) \
python311-mathics-pygments \
python3dist(mathics-pygments)"
RDEPENDS:${PN} += "python(abi) \
python311-Mathics-Scanner \
python311-Pygments"

inherit rpm
