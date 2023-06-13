SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python310-sphinx-book-theme-0.1.3-1.8.noarch.rpm"
RPM_HASH = "0fa3323fc4b3a50a097771b2ac204240937fe86209334a967de8b9dde22e5d709717eadff2948486c2d87b856c178b669f0a41c76631bfb911cf842dfe185bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-book-theme \
python3.10dist(sphinx-book-theme) \
python310-sphinx-book-theme \
python3dist(sphinx-book-theme)"

RDEPENDS:${PN} += "python(abi) \
python310-PyYAML \
python310-Sphinx \
python310-beautifulsoup4 \
python310-click \
python310-docutils \
python310-pydata-sphinx-theme"

inherit rpm
