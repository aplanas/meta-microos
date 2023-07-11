SUMMARY = "Prometheus exporter for SAP hosts"
DESCRIPTION = "A Prometheus metrics exporter that connects to the SAPControl web interface \
to collect data about SAP systems like NetWeaver and S4/HANA."
LICENSE = "Apache-2.0"

PV = "0.6.0+git.1685628435.48c4099"

RPM_NAME = "prometheus-sap_host_exporter-0.6.0+git.1685628435.48c4099-1.2.aarch64.rpm"
RPM_HASH = "7394836407252464de2d2a7918cb92e593e5a73979d3b4937bb3aca47f40311183e3bddd5aad8a210ef4f70b4b8c33ea7cd61da548c9d21c35dbb65bad086888"

RPROVIDES:${PN} += "config-prometheus-sap-host-exporter \
prometheus-sap-host-exporter \
sap-host-exporter"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
