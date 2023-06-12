SUMMARY = "Distribution utilities"
DESCRIPTION = "Python distribution utilities."
LICENSE = "Python-2.0"

PV = "0.3.6"

RPM_NAME = "python310-distlib-0.3.6-2.1.noarch.rpm"
RPM_HASH = "515e62fb184f7a449d71dcbd36e3548723cb4025c319f8a6b629e0be5c67772d3b8f4a0e3b3546131d798c6d4aa406b986dd8ac4263a6d515f042059d384d29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-distlib \
python3.10dist(distlib) \
python310-distlib \
python3dist(distlib)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
