SUMMARY = "Prometheus alerts for a Ceph deployment"
DESCRIPTION = "This package provides Ceph default alerts for Prometheus."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-prometheus-alerts-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "5d121b21443f9722014e2b2d4d07ca00b9233fb52a213d12baa2f98be857a4f9a8d6d112784abfaae65cc348e9536e246f4fd2ecf30b5249441010b34a171473"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-prometheus-alerts \
config-ceph-prometheus-alerts"

RDEPENDS:${PN} += ""

inherit rpm
