SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python39-sphinxcontrib-nwdiag-2.0.0-1.14.noarch.rpm"
RPM_HASH = "090e4497632c150dda439e2c6314d422963449179ff7afcc04ffa52e6732c9f3f8651ef63c9001b5d9bab4112c5cc8c2d32859b1aae2bf8b68412a1d387867b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-nwdiag \
python39-sphinxcontrib-nwdiag \
python3dist-sphinxcontrib-nwdiag"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-blockdiag \
python39-nwdiag"

inherit rpm
