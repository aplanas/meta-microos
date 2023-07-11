SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python311-sphinx-book-theme-0.1.3-1.10.noarch.rpm"
RPM_HASH = "9463399123456e2deae570fbcb4f38326609a13124482d41accc09c1c19ea4bec9b9e0aef71b29368d7ae7b576471c7f73ae9566e6bb0d19ef1024bd87a8c153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-book-theme \
python3.11dist-sphinx-book-theme \
python311-sphinx-book-theme \
python3dist-sphinx-book-theme"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-Sphinx \
python311-beautifulsoup4 \
python311-click \
python311-docutils \
python311-pydata-sphinx-theme"

inherit rpm
