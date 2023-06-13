SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-mathics-pygments-1.0.2-1.7.noarch.rpm"
RPM_HASH = "98685bf6787b11b0aa35956bf73fed355670a7b5e2443d80e6497037f657ddecb875e9dc8a25adf7c32f12d801d8cc5493180ac7889d0b87b920523a32709380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mathics-pygments \
python3.10dist(mathics-pygments) \
python310-mathics-pygments \
python3dist(mathics-pygments)"

RDEPENDS:${PN} += "python(abi) \
python310-Mathics-Scanner \
python310-Pygments"

inherit rpm
