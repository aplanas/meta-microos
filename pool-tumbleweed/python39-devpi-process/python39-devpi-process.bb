SUMMARY = "Programmatic API to create and use a devpi server process"
DESCRIPTION = "This package provides a programmatic API to create and use a \
devpi server process."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-devpi-process-0.3.0-1.1.noarch.rpm"
RPM_HASH = "8299e5641f8d818c51e53dd207828aaa4b03e6e497f9112842855b5c3a0e489b310ef1b0577d078e94cf586128d0fcd203994e7196ea6b3b3757bce0683dc6a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(devpi-process) \
python39-devpi-process \
python3dist(devpi-process)"

RDEPENDS:${PN} += "python(abi) \
python39-devpi-client \
python39-devpi-server"

inherit rpm
