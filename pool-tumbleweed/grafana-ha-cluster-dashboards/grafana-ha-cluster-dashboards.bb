SUMMARY = "Grafana Dashboards for Pacemaker/Corosync HA Clusters"
DESCRIPTION = "Grafana Dashboards displaying metrics about Pacemaker/Corosync High Availability Clusters."
LICENSE = "Apache-2.0"

PV = "1.1.0+git.1622804483.3ca98bd"

RPM_NAME = "grafana-ha-cluster-dashboards-1.1.0+git.1622804483.3ca98bd-1.6.noarch.rpm"
RPM_HASH = "1e40bad89c230ffd01faea5407aff9341c506f7dcbb76effced9104c79e2ab6b5bcb9adc11a09e022c379b97401c42173fa1ae945215b57fcc8ed4a780456494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-grafana-ha-cluster-dashboards \
grafana-ha-cluster-dashboards"

RDEPENDS:${PN} += "/bin/sh \
grafana-sleha-provider \
shadow"

inherit rpm
