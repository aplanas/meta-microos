SUMMARY = "Prometheus exporter for SAP hosts"
DESCRIPTION = "A Prometheus metrics exporter that connects to the SAPControl web interface \
to collect data about SAP systems like NetWeaver and S4/HANA."
LICENSE = "Apache-2.0"

PV = "0.6.0+git.1685628435.48c4099"

RPM_NAME = "prometheus-sap_host_exporter-0.6.0+git.1685628435.48c4099-1.1.aarch64.rpm"
RPM_HASH = "5d93c1ace8d3633fcad94def838dd9f3de30c9973fae74bdfe54ecefc393a676deaa9029d0d24d06510c196f676ce723f83f7e5bd81a5ce6e093332df94d6f09"

RPROVIDES:${PN} += "config-prometheus-sap-host-exporter \
prometheus-sap-host-exporter \
sap-host-exporter"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
