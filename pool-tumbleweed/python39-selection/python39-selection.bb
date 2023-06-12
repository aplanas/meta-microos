SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.14"

RPM_NAME = "python39-selection-0.0.14-1.16.noarch.rpm"
RPM_HASH = "48a6cddaa5070eed8866b68893c09a9a7c8c210e2cb92cd2e403c63081d4abd698912db9c6547e5fc0d3d5630aa80489771fd597a480f1236585288063ad8b67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(selection) \
python39-selection \
python3dist(selection)"
RDEPENDS:${PN} += "python(abi) \
python39-lxml \
python39-six \
python39-weblib"

inherit rpm
