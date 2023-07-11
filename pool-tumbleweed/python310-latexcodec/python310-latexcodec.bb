SUMMARY = "A lexer and codec to work with LaTeX code in Python"
DESCRIPTION = "A lexer and codec to work with LaTeX code in Python."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-latexcodec-2.0.1-3.4.noarch.rpm"
RPM_HASH = "63dbb40c03de51d41ed1ce6b256181e77e3807103606a96ce9e6eb8a0e2b47fdc177ff33a82eca0c92ef04abf666531eb5f8d263b05e5ea4d53c36692567c1ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-latexcodec \
python310-latexcodec \
python3dist-latexcodec"

RDEPENDS:${PN} += "python-abi"

inherit rpm
