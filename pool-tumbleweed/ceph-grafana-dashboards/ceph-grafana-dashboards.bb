SUMMARY = "The set of Grafana dashboards for monitoring purposes"
DESCRIPTION = "This package provides a set of Grafana dashboards for monitoring of \
Ceph clusters. The dashboards require a Prometheus server setup \
collecting data from Ceph Manager 'prometheus' module and Prometheus \
project 'node_exporter' module. The dashboards are designed to be \
integrated with the Ceph Manager Dashboard web UI."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-grafana-dashboards-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "2a88e4466b7c4116bfa580a56278ef1bf20d460b97873363dde7836b12d01a0fdf063521e78e1fe89d34f817aef5d7cd8218c46b520f2183deebc7f139688f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-grafana-dashboards \
config(ceph-grafana-dashboards)"

RDEPENDS:${PN} += ""

inherit rpm
