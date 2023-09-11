SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.3.0"

RPM_NAME = "python310-sphinx_rtd_theme-1.3.0-1.1.noarch.rpm"
RPM_HASH = "5ff72e573fbaa7a1b200192052aaad4924f5e539d1f1e6f36abca9b1776b55b315bbe09374e828ba3ece44e8d7d5122446194b3838816e47b53d4a976d55d44d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-rtd-theme \
python310-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-docutils \
python310-sphinxcontrib-jquery"

inherit rpm
