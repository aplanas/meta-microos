SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python310-sphinxcontrib-nwdiag-2.0.0-1.14.noarch.rpm"
RPM_HASH = "6d163852042fc62d3b84ac9857ae4998caa8e152b7acd1bdc35633777bbc57c8fdb74d57a2d9e1e4d51dbce19cafd0e2af62fde7832ce269211cac5399db0546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-nwdiag \
python310-sphinxcontrib-nwdiag \
python3dist-sphinxcontrib-nwdiag"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-blockdiag \
python310-nwdiag"

inherit rpm
