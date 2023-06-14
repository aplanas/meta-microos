SUMMARY = "Python module to draw ASCII trees"
DESCRIPTION = "ASCIItree draws tree structures using characters."
LICENSE = "MIT"

PV = "0.3.3"

RPM_NAME = "python39-asciitree-0.3.3-3.11.noarch.rpm"
RPM_HASH = "f522e8174b5fe83e3a1877f6e5d0e0a09e23501b51600e33415dd946e7707bfa1159b6a6dc48b2c20c2509bada6bf67efa16b1896cb27adbe6ccc0440693bfe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asciitree \
python39-asciitree \
python3dist-asciitree"

RDEPENDS:${PN} += "python-abi"

inherit rpm
