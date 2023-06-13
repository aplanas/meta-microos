SUMMARY = "Grafana Dashboards displaying metrics about SAP HANA databases."
DESCRIPTION = "Grafana Dashboards displaying metrics about SAP HANA databases."
LICENSE = "Apache-2.0"

PV = "1.0.2+git.1623658432.f49b536"

RPM_NAME = "grafana-sap-hana-dashboards-1.0.2+git.1623658432.f49b536-1.6.noarch.rpm"
RPM_HASH = "f78f56e8b476c504cd725b60277fd84b065f6453827bcd5e137d372d92694356429cd3534908dce2b5f7792b58cb65776afe54d0e7ae63a050968c76efca3936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(grafana-sap-hana-dashboards) \
grafana-sap-hana-dashboards"

RDEPENDS:${PN} += "grafana-sap-providers"

inherit rpm
