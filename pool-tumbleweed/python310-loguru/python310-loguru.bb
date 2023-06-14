SUMMARY = "Python logging component with a simple interface"
DESCRIPTION = "Python logging component providing a single object \
which dispatches log messages to configured handlers."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-loguru-0.7.0-2.1.noarch.rpm"
RPM_HASH = "d05ccd0365a49d30ff0b853df7e34a4cfdd8deebca2039c31d46b2877935b3d7f2dd4418f5a953f607a2d6b5310543f22e2b0fdc6d5ad7a5920309f81308c05d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-loguru \
python3.10dist-loguru \
python310-loguru \
python3dist-loguru"

RDEPENDS:${PN} += "python-abi"

inherit rpm
