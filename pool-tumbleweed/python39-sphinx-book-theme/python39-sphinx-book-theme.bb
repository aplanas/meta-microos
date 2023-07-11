SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-sphinx-book-theme-0.1.3-1.10.noarch.rpm"
RPM_HASH = "6a4b46cdbe4ecb0ef02aaed3669090ae9038124c44320be30577901d60c32e8ae06caf955cd435e70fa1643279ee4a5b4a4a15f24732cb7d69d8c86ab650d17a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-book-theme \
python39-sphinx-book-theme \
python3dist-sphinx-book-theme"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-Sphinx \
python39-beautifulsoup4 \
python39-click \
python39-docutils \
python39-pydata-sphinx-theme"

inherit rpm
