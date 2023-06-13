SUMMARY = "Extension pack for Python Markdown"
DESCRIPTION = "Extension pack for Python Markdown"
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-mkdocs-material-extensions-1.1.1-2.1.noarch.rpm"
RPM_HASH = "0e62b7eb231334a7403ccf04446c4624ed4de8c930da929d25885d95e0fffc03d81fe0d62d3c4f0ed43e9215d2e396f17712263684d3b317b2a2b8d09dae66c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mkdocs-material-extensions) \
python39-mkdocs-material-extensions \
python3dist(mkdocs-material-extensions)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
