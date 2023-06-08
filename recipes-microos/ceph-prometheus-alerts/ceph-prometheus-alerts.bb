SUMMARY = "Prometheus alerts for a Ceph deployment"
DESCRIPTION = "This package provides Ceph default alerts for Prometheus."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-prometheus-alerts-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "b3c9bfd7218685334d3aed258f4264661065ea74bcb3516210b9ba2033e72dc984d587a927f96d154834581883293593108f7427da78ed40b5038e0f9b650a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-prometheus-alerts config(ceph-prometheus-alerts)"
RDEPENDS:${PN} += ""

inherit rpm
