SUMMARY = "Prometheus alerts for a Ceph deployment"
DESCRIPTION = "This package provides Ceph default alerts for Prometheus."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-prometheus-alerts-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "d5666b0ece484f84e77c5be425cf7cb8c4e18b6a29872852f654661ecdfc97413e04ac02dfbbeb723c0179327a6ee16bf940387da33013027b3f057f1462f6d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-prometheus-alerts \
config-ceph-prometheus-alerts"

RDEPENDS:${PN} += ""

inherit rpm
