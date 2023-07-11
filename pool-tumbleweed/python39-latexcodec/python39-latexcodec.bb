SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-latexcodec-2.0.1-3.4.noarch.rpm"
RPM_HASH = "d309e02646c1cd5350b9044fb83e567ffcbf16da21518a3bae3d1ca272ed62434a15b9efc66b6200d2a4425da46ce77f8f095b69c1b506d7fad0076c862b901c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-latexcodec \
python39-latexcodec \
python3dist-latexcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
