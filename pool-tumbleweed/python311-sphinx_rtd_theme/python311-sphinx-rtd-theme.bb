SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.3.0"

RPM_NAME = "python311-sphinx_rtd_theme-1.3.0-1.1.noarch.rpm"
RPM_HASH = "fb010a5544d5d4bbeb0a9750cc8c47024ca7711ff7da8bc3ec16eb5ac6562700e73218841456f7e603f3d2fde0f929bc81fae04857ea30f85761ace0d2ee39b8"
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
