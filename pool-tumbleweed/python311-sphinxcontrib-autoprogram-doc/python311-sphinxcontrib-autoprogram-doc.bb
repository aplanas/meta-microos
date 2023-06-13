SUMMARY = "Documentation for sphinxcontrib-autoprogram"
DESCRIPTION = "This package contains the documentation for the package \
python-sphinxcontrib-autoprogram."
LICENSE = "BSD-2-Clause"

PV = "0.1.8"

RPM_NAME = "python311-sphinxcontrib-autoprogram-doc-0.1.8-2.1.noarch.rpm"
RPM_HASH = "aebcb57b8c6452bec2add1e1fe067b70d693f60311a4bd37e619af0158ed491ba52b3f6838430fb9f921f8c0836e8455a9f584cbecf6bdecab11cc8582d565d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-sphinxcontrib-autoprogram-doc"

RDEPENDS:${PN} += "python311-Sphinx"

inherit rpm
