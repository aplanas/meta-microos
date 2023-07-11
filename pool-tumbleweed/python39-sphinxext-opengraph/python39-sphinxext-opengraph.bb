SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python39-sphinxext-opengraph-0.7.5-1.5.noarch.rpm"
RPM_HASH = "37951f491ca9aa47b1bc6e7a115125747dd4a2663ea55000511c2948c4944f27ddbddacfbe9b2ac75696dc5a7e05655ce68f05b6203177d6385fa03d98b206ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxext-opengraph \
python39-sphinxext-opengraph \
python3dist-sphinxext-opengraph"

RDEPENDS:${PN} += "python-abi \
python3-Sphinx"

inherit rpm
