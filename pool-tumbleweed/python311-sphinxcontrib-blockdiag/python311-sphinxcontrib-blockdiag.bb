SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python311-sphinxcontrib-blockdiag-3.0.0-3.3.noarch.rpm"
RPM_HASH = "b2f2060db38f9c97d9f84771932ef309e61ac02875841d95e0989173896983d1dc4633c645cd24903b1035d8bf7c96b267dcd642a6fecbff94a9e3f5fa3c3277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinxcontrib-blockdiag) \
python311-sphinxcontrib-blockdiag \
python3dist(sphinxcontrib-blockdiag)"

RDEPENDS:${PN} += "python(abi) \
python311-Sphinx \
python311-blockdiag"

inherit rpm
