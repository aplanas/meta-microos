SUMMARY = "Grafana configuration providers for SAP applications"
DESCRIPTION = "Automated configuration provisioners leveraged by other packages to enable a zero-config installation of Grafana dashboards."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "grafana-sap-providers-1.1-1.8.noarch.rpm"
RPM_HASH = "b284f12ae72e15cdbab0bce02787892083c231f25b0af58577cf120678ff465a1567110729b1d288f015a49d61a6ed8a21f7e465e81b5e67b7448a4dc3dfd4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-sap-providers \
grafana-sap-providers"

RDEPENDS:${PN} += "/bin/sh \
shadow"

inherit rpm
