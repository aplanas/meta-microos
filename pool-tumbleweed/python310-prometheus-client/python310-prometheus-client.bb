SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python310-prometheus-client-0.17.0-2.3.noarch.rpm"
RPM_HASH = "932f84f30ae5d8d3731aa1c3a6a8698e1343f904d10e672f8c6e944dae33a0eb5229bb8766a21f6ee6623eded07a7aaaf9d0044a35b7853b5ce9da73e4f4a936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-prometheus-client \
python310-prometheus-client \
python3dist-prometheus-client"

RDEPENDS:${PN} += "python-abi"

inherit rpm
