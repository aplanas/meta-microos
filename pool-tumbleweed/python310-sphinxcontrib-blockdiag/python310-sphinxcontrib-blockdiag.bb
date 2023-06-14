SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python310-sphinxcontrib-blockdiag-3.0.0-3.3.noarch.rpm"
RPM_HASH = "8cbd411578997258633f76d8fa794f668b62da64d574cd9a29c34d179d17b5bfb4bef0cd37f03f973ea6774b13b72f04a8dcfd89b9c90b393a21321c53a08608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-blockdiag \
python3.10dist-sphinxcontrib-blockdiag \
python310-sphinxcontrib-blockdiag \
python3dist-sphinxcontrib-blockdiag"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-blockdiag"

inherit rpm
