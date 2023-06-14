SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "1.2.0"

RPM_NAME = "python310-sphinx_rtd_theme-1.2.0-1.1.noarch.rpm"
RPM_HASH = "863989ddc5264c14d97499c805bea8931a89e7e25eff3d33762eaef39efc68eb2c612aacbb40e73ce2154b5e47cc030a62a0c38c19cfc37f8f4d7be03af644b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-rtd-theme \
python3.10dist-sphinx-rtd-theme \
python310-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-docutils \
python310-sphinxcontrib-jquery"

inherit rpm
