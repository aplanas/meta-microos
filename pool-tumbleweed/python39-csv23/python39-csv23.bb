SUMMARY = "Python 2/3 unicode CSV compatibility layer"
DESCRIPTION = "Python 2/3 unicode CSV compatibility layer"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-csv23-0.3.4-2.3.noarch.rpm"
RPM_HASH = "299e2d2e2f99142c37739ea02fc7564500338a2a00ca94557f8945ab4b971c2bc51f664c1ee611d80b00c60ac32d3d260962a6b4461fe6b8c1a46ac26a789ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-csv23 \
python39-csv23 \
python3dist-csv23"

RDEPENDS:${PN} += "python-abi"

inherit rpm
