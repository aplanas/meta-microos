SUMMARY = "Prometheus Alertmanager receiver for SNMP traps"
DESCRIPTION = "prometheus-webhook-snmp is a Prometheus Alertmanager receiver that \
translates incoming notifications into SNMP traps."
LICENSE = "GPL-3.0"

PV = "1.4"

RPM_NAME = "prometheus-webhook-snmp-1.4-2.7.noarch.rpm"
RPM_HASH = "57e065aa5cba5ea7367a363a67f7e6dd275804acdde550944e4b17b5fe3529fda9699a32f19f0c5adf5348644e72f3afe30efc40a3da4e4a7949ee6a3084f1cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-webhook-snmp"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-CherryPy \
python3-PyYAML \
python3-click \
python3-dateutil \
python3-prometheus-client \
python3-pysnmp"

inherit rpm
