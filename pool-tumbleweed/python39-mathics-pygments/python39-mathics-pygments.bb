SUMMARY = "Mathematica/Wolfram Language Lexer for Pygments"
DESCRIPTION = "A lexer and highlighter for Mathematica/Wolfram Language source code using the \
pygments engine."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-mathics-pygments-1.0.2-1.9.noarch.rpm"
RPM_HASH = "8d1ef9047a32ef5a333ae29071a63c8bc5db8c03368982004e1376c88a9ceca2dda8aa6fa163f5cc1cee55ae7423c9f484abc2eafbad5306d02c58ae42d104b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mathics-pygments \
python39-mathics-pygments \
python3dist-mathics-pygments"

RDEPENDS:${PN} += "python-abi \
python39-Mathics-Scanner \
python39-Pygments"

inherit rpm
