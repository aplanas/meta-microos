SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python310-sphinxcontrib-svg2pdfconverter-1.2.2-1.3.noarch.rpm"
RPM_HASH = "a920d58f1123e66dde3f9793f54f0b57c9a562356162fc811d7449cfd4ce8de60bd0881f989d2b9146e0023c5611ebb3a13ac69375fc3c5f19fc06518f7a7122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-svg2pdfconverter \
python310-sphinxcontrib-svg2pdfconverter \
python3dist-sphinxcontrib-svg2pdfconverter"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
