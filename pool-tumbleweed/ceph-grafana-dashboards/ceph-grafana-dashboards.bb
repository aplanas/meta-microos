SUMMARY = "The set of Grafana dashboards for monitoring purposes"
DESCRIPTION = "This package provides a set of Grafana dashboards for monitoring of \
Ceph clusters. The dashboards require a Prometheus server setup \
collecting data from Ceph Manager 'prometheus' module and Prometheus \
project 'node_exporter' module. The dashboards are designed to be \
integrated with the Ceph Manager Dashboard web UI."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-grafana-dashboards-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "fb4fb81a18699cbf8b70e106756d9565164025ba7d3119f15594847a83cda7b9a86ef14af854a21234c3e08766d4bf7da7950b5ad1b634e2c3786f9cc0bbf728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-grafana-dashboards \
config-ceph-grafana-dashboards"

RDEPENDS:${PN} += ""

inherit rpm
