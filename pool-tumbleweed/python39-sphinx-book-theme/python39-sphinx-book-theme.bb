SUMMARY = "Jupyter Book: Create an online book with Jupyter Notebooks"
DESCRIPTION = "Jupyter Book: Create an online book with Jupyter Notebooks"
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-sphinx-book-theme-0.1.3-1.8.noarch.rpm"
RPM_HASH = "5c28d9d9accdae1dc1302fd8ad4285fd3a18498a6f909f4081d0f9e0625a49b99164e5253641104c9215b4f062c17666b265bd8c977d47093c6ba891bdba28a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-book-theme) \
python39-sphinx-book-theme \
python3dist(sphinx-book-theme)"

RDEPENDS:${PN} += "python(abi) \
python39-PyYAML \
python39-Sphinx \
python39-beautifulsoup4 \
python39-click \
python39-docutils \
python39-pydata-sphinx-theme"

inherit rpm
