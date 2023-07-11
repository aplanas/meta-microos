SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.2.0"

RPM_NAME = "python310-sphinx_rtd_theme-1.2.0-1.2.noarch.rpm"
RPM_HASH = "28a5ca0d70514170a69eb7430364d3c2b3008b84933c3bd801f0b8c4651e32bd232e8213dec3f98382e7b976370f6d72c596b6ffcc3ebfaa9f274726ba516a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-rtd-theme \
python310-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-docutils \
python310-sphinxcontrib-jquery"

inherit rpm
