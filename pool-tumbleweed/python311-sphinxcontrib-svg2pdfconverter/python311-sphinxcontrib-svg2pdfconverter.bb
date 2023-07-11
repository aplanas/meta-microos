SUMMARY = "Sphinx SVG to PDF converter extension"
DESCRIPTION = "Sphinx SVG to PDF converter extension"
LICENSE = "BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "python311-sphinxcontrib-svg2pdfconverter-1.2.2-1.3.noarch.rpm"
RPM_HASH = "3b53ecf71dca6b80b70075198baebe092405b20ec29c906076cafed0fea32e3cb2e94ca361bd1235eb806d945cda26fab33c287d17a97f3504e2b991bc9a033f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-svg2pdfconverter \
python3.11dist-sphinxcontrib-svg2pdfconverter \
python311-sphinxcontrib-svg2pdfconverter \
python3dist-sphinxcontrib-svg2pdfconverter"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
