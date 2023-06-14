SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python39-prometheus-client-0.17.0-2.1.noarch.rpm"
RPM_HASH = "c82928ac5ccd440de576e744adeee50de8845448365b24328ac7ceae4c22b08a42bfd03580d7ac1a847c4b7fec3cb8891c85403b05e804aee415b237d1db2a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-prometheus-client \
python39-prometheus-client \
python3dist-prometheus-client"

RDEPENDS:${PN} += "python-abi"

inherit rpm
