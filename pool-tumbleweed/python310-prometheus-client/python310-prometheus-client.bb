SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python310-prometheus-client-0.17.0-2.1.noarch.rpm"
RPM_HASH = "637d4730c6aeb6e19a8265ed4890cefb0c7f49c6fb4403977df39ee67d6d2ca6508bf287330d316d490435e5b8f1102d77d0d20f431debc3df05b3cc8759c520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prometheus-client \
python3.10dist-prometheus-client \
python310-prometheus-client \
python3dist-prometheus-client"

RDEPENDS:${PN} += "python-abi"

inherit rpm
