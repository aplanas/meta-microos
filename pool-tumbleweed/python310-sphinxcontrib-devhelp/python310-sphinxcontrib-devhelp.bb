SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.5"

RPM_NAME = "python310-sphinxcontrib-devhelp-1.0.5-1.1.noarch.rpm"
RPM_HASH = "29431edc36a831cc5501f8e21be2a621b86201de281ec8c49bce75546fcac0338a8cffd1ccbb067c9c9ac4f22a70a5dedebb08c24b5fddb5d972429449a94228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-devhelp \
python310-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
