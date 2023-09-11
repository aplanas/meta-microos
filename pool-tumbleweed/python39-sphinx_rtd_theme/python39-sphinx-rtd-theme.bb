SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.3.0"

RPM_NAME = "python39-sphinx_rtd_theme-1.3.0-1.1.noarch.rpm"
RPM_HASH = "9746d303e6b552131113657f709eaecdc2922e10c78e7b715c427e79a7f02bad97604a27521bd54792f0364bd7ee752aa903bb6074b4b60add9d89d64bfed1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-rtd-theme \
python39-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-docutils \
python39-sphinxcontrib-jquery"

inherit rpm
