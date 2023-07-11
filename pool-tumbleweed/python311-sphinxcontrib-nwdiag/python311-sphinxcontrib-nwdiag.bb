SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python311-sphinxcontrib-nwdiag-2.0.0-1.14.noarch.rpm"
RPM_HASH = "727277f7d5e6ef9e730a1ea75313039ccd03c4ffd6a2ac67afd4d38ce9111f95c556dda8d6e18fe31be92476e7f8a9923adc4bfa2e14fad317a2b47f3306a07c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-nwdiag \
python3.11dist-sphinxcontrib-nwdiag \
python311-sphinxcontrib-nwdiag \
python3dist-sphinxcontrib-nwdiag"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-blockdiag \
python311-nwdiag"

inherit rpm
