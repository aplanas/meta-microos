SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python39-sphinxcontrib-blockdiag-3.0.0-3.5.noarch.rpm"
RPM_HASH = "dc21f2874701eb548489ab20f2058f74239f078616d0ebc27424c187eade5305c40873e78fb7216fc2c741a06fdf4c4e1d50dfbb8cd9bcfc84410c98acd5977d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-blockdiag \
python39-sphinxcontrib-blockdiag \
python3dist-sphinxcontrib-blockdiag"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-blockdiag"

inherit rpm
