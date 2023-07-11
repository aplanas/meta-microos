SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.2.0"

RPM_NAME = "python311-sphinx_rtd_theme-1.2.0-1.2.noarch.rpm"
RPM_HASH = "36962502c7da44cfbd9fd9c0b4c30faf2ebd177953241d8f35602807db54c99df4d0423c2e7b7494e4ae2bfbbd6a4c3a37859dd9509e07cd5d2188aea86ae984"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-rtd-theme \
python3.11dist-sphinx-rtd-theme \
python311-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-docutils \
python311-sphinxcontrib-jquery"

inherit rpm
