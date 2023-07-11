SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.2.0"

RPM_NAME = "python39-sphinx_rtd_theme-1.2.0-1.2.noarch.rpm"
RPM_HASH = "c6a46a990ddd517da1a3e617e2b798e10710c14a5a69cf3ee04259136cd1f6c8fc77ea372475d7d6e8c63519e35e3649c52fca1baa61a94c6ed9c9b90c59f96e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-rtd-theme \
python39-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-docutils \
python39-sphinxcontrib-jquery"

inherit rpm
