SUMMARY = "Prometheus exporter for Pacemaker HA clusters metrics"
DESCRIPTION = "Prometheus exporter for Pacemaker HA clusters metrics"
LICENSE = "Apache-2.0"

PV = "1.3.3+git.1683650163.1000ba6"

RPM_NAME = "prometheus-ha_cluster_exporter-1.3.3+git.1683650163.1000ba6-1.2.aarch64.rpm"
RPM_HASH = "4a7f2643e3578bd146a5a4153edec0e156cca5105f525608a84fe55bc284f362789821bae7ec526978940797de61ba74c48bf932b38c1dae3b938464eae163cf"

RPROVIDES:${PN} += "ha-cluster-exporter \
prometheus-ha-cluster-exporter"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
