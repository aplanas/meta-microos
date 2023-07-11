SUMMARY = "Prometheus alerts for a Ceph deployment"
DESCRIPTION = "This package provides Ceph default alerts for Prometheus."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-prometheus-alerts-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "f5910bd6ad178f1553fce95a034bae0bad36461672c0d16e777fa6fe3ad34d9e7cd5dd80199f6311393c1ccf655b9ffaf8bb9624900a01ed3c3707373377fbc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-prometheus-alerts \
config-ceph-prometheus-alerts"

RDEPENDS:${PN} += ""

inherit rpm
