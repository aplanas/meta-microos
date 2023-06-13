SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-pdfrw-0.4-3.16.noarch.rpm"
RPM_HASH = "64784060cd98fa4931f5addfda3232f2ce59fd5f247176e0640a1a8b7994e46fba4cd257cebc22c326e061e683286ad3167cee53ff0cb04b74e2bc207a07e0da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pdfrw) \
python39-pdfrw \
python3dist(pdfrw)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
