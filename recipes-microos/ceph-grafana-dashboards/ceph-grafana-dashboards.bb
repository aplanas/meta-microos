SUMMARY = "The set of Grafana dashboards for monitoring purposes"
DESCRIPTION = "This package provides a set of Grafana dashboards for monitoring of \
Ceph clusters. The dashboards require a Prometheus server setup \
collecting data from Ceph Manager 'prometheus' module and Prometheus \
project 'node_exporter' module. The dashboards are designed to be \
integrated with the Ceph Manager Dashboard web UI."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-grafana-dashboards-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "7310a8830d1573c2972007a63f2cfbea43671b39c26a607762969dacfc8b9fbb4950320b1e43a7f0533e06b6ab68aed3844fa8eee46a8035d72b0250301784f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-grafana-dashboards config(ceph-grafana-dashboards)"
RDEPENDS:${PN} += ""

inherit rpm
