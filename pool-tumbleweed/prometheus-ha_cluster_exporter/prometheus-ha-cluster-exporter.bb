SUMMARY = "Prometheus exporter for Pacemaker HA clusters metrics"
DESCRIPTION = "Prometheus exporter for Pacemaker HA clusters metrics"
LICENSE = "Apache-2.0"

PV = "1.3.3+git.1683650163.1000ba6"

RPM_NAME = "prometheus-ha_cluster_exporter-1.3.3+git.1683650163.1000ba6-1.1.aarch64.rpm"
RPM_HASH = "3f0b0b390e160bd99f8cbfb45877fa0cb9f1911d772472333e785445b573e85bb50515c1da5754d50a522cc96332565b3bee92794e9b33d83273d896560d220d"

RPROVIDES:${PN} += "ha-cluster-exporter \
prometheus-ha-cluster-exporter"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
