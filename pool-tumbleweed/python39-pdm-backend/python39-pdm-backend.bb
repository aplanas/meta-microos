SUMMARY = "Backend used by PDM"
DESCRIPTION = "The build backend used by [PDM] that supports latest packaging standards."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python39-pdm-backend-2.1.0-2.1.noarch.rpm"
RPM_HASH = "820b9ee46785abf754ca9a5d1559688666c3eac5835c4b410e36b6e0b0fd0e65c4fe580e93134561efa7cf2988938259faf089876d3c1b2073407881f84c1bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pdm-backend \
python39-pdm-backend \
python3dist-pdm-backend"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata"

inherit rpm
