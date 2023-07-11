SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-sphinx-book-theme-0.1.3-1.10.noarch.rpm"
RPM_HASH = "d46c734da474628f4dd0981dba78bfb78cb0a9d8afaf22b02dbd149f73e3364c64615d03c3f54d4a176b996c07560327c8faf15e1e92e9def59b212b1a247dd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-book-theme \
python310-sphinx-book-theme \
python3dist-sphinx-book-theme"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-Sphinx \
python310-beautifulsoup4 \
python310-click \
python310-docutils \
python310-pydata-sphinx-theme"

inherit rpm
