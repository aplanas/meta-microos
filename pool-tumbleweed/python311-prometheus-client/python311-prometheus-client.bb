SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python311-prometheus-client-0.17.0-2.3.noarch.rpm"
RPM_HASH = "fb55c468d52eec7d9ce1df15c974a9db68a2c3ca4c4d17fb6ac310f7fcbe9a0a11713c26baf12ea5ec68abae49fc7a7b4c053c0d8a79280139b8ba5c56617dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prometheus-client \
python3.11dist-prometheus-client \
python311-prometheus-client \
python3dist-prometheus-client"

RDEPENDS:${PN} += "python-abi"

inherit rpm
