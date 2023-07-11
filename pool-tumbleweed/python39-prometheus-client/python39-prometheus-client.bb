SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python39-prometheus-client-0.17.0-2.3.noarch.rpm"
RPM_HASH = "781406780b94efd47703e1ea67bc0a50c832d938a32a9a39b232094b9f48dfb57416656fad7f2c0fcaea01432d271200106603250918b1c3f4a2b001055a3a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-prometheus-client \
python39-prometheus-client \
python3dist-prometheus-client"

RDEPENDS:${PN} += "python-abi"

inherit rpm
