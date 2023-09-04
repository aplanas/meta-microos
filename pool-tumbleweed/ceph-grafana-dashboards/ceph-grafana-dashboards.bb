SUMMARY = "The set of Grafana dashboards for monitoring purposes"
DESCRIPTION = "This package provides a set of Grafana dashboards for monitoring of \
Ceph clusters. The dashboards require a Prometheus server setup \
collecting data from Ceph Manager 'prometheus' module and Prometheus \
project 'node_exporter' module. The dashboards are designed to be \
integrated with the Ceph Manager Dashboard web UI."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-grafana-dashboards-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "ecebfcce68d95c666f8854a06e3a4119d5ec3ef29cf07215ca986daa275f84e0de8582fac7a48d92010f3ec0652ecb3bfe96cfb0d05ad6d9923686e57dafab2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-grafana-dashboards \
config-ceph-grafana-dashboards"

RDEPENDS:${PN} += ""

inherit rpm
