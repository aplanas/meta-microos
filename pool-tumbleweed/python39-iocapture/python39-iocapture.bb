SUMMARY = "Python module to capture stdout, stderr"
DESCRIPTION = "A Python module to capture stdout, stderr with iocapture."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-iocapture-0.1.2-2.14.noarch.rpm"
RPM_HASH = "1b8096bdc2154e793fadb813797f15d12f24f71cf476125e6769231ea7e28cbc6eed233978c175ab115dc6863805dbda18f86c8babc800b2f7abdd53f89dc6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-iocapture \
python39-iocapture \
python3dist-iocapture"

RDEPENDS:${PN} += "python-abi"

inherit rpm
