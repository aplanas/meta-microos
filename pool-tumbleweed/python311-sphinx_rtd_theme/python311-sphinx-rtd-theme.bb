SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.2.0"

RPM_NAME = "python311-sphinx_rtd_theme-1.2.0-1.1.noarch.rpm"
RPM_HASH = "cb66ab33a58b0a9af74a63fbf51766d3f1c19af26eaaa4a302e1cb2713daca0812149fe9cab497fa49185d9cd4bcdd5949d997fff1a93f0734eebdaa31e84790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-rtd-theme) \
python311-sphinx_rtd_theme \
python3dist(sphinx-rtd-theme)"

RDEPENDS:${PN} += "python(abi) \
python311-Sphinx \
python311-docutils \
python311-sphinxcontrib-jquery"

inherit rpm
