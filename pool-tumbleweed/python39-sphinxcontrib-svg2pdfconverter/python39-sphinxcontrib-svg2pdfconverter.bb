SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python39-sphinxcontrib-svg2pdfconverter-1.2.2-1.3.noarch.rpm"
RPM_HASH = "90d3e93ff037c775726c6cbabe62f9f2632c69835873314a3a5f894456506103930a888f839dc4ac403c3e76f6292b538a17932e5d68e765f1b606e7a4773909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-svg2pdfconverter \
python39-sphinxcontrib-svg2pdfconverter \
python3dist-sphinxcontrib-svg2pdfconverter"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
