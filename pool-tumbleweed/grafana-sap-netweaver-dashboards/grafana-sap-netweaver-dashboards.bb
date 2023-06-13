SUMMARY = "Grafana Dashboards displaying metrics about a SAP NetWeaver landscape."
DESCRIPTION = "Grafana Dashboards displaying metrics about a SAP NetWeaver landscape."
LICENSE = "Apache-2.0"

PV = "1.0.3+git.1601889366.9f71957"

RPM_NAME = "grafana-sap-netweaver-dashboards-1.0.3+git.1601889366.9f71957-1.8.noarch.rpm"
RPM_HASH = "50a2212a5de0540a0c5cc1ecfeeee2b9a01fd47f61194462e75953d4fd116a9232f4d5841cf27b1aa8ec5ae1a607689b6ce72661f777ce66ce2e4c522cbef9ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(grafana-sap-netweaver-dashboards) \
grafana-sap-netweaver-dashboards"

RDEPENDS:${PN} += "grafana-sap-providers"

inherit rpm
