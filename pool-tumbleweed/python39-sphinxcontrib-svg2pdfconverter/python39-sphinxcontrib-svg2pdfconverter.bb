SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python39-sphinxcontrib-svg2pdfconverter-1.2.2-1.1.noarch.rpm"
RPM_HASH = "379002f16b3f93215f579ea40ada2e9926407f23920eb49616c23a554bf384ed8b30b5e1b5f070dd79b44221dfd33600843e11741fe09a49cb0acf44d53ddeb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-svg2pdfconverter) \
python39-sphinxcontrib-svg2pdfconverter \
python3dist(sphinxcontrib-svg2pdfconverter)"
RDEPENDS:${PN} += "python(abi) \
python39-Sphinx"

inherit rpm
