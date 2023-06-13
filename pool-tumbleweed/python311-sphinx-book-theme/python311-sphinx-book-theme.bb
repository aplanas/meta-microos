SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-sphinx-book-theme-0.1.3-1.8.noarch.rpm"
RPM_HASH = "9a8441f8020adda25362c0017612ff5fce204cb60e4aedb7472ee156b0d8022d84074ba5d4fc9e48b06cda859a2b220e3ad596fd6f89c0ba8bc8e8cc3cbb7f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-book-theme) \
python311-sphinx-book-theme \
python3dist(sphinx-book-theme)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML \
python311-Sphinx \
python311-beautifulsoup4 \
python311-click \
python311-docutils \
python311-pydata-sphinx-theme"

inherit rpm
