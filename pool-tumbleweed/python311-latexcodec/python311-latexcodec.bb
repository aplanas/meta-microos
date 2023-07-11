SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-latexcodec-2.0.1-3.4.noarch.rpm"
RPM_HASH = "8484b19cce70161f6e434afee4f8e5b1fe8a0c1419a6307612422b55cb490181ac8bc0d968309952f7e5547510e7bc9a111c60e2c40389bf172377a5831cdacc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-latexcodec \
python3.11dist-latexcodec \
python311-latexcodec \
python3dist-latexcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
