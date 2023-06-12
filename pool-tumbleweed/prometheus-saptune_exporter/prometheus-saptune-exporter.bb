SUMMARY = "Prometheus exporter for saptune metrics"
DESCRIPTION = "Prometheus exporter for Saptune metrics"
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "prometheus-saptune_exporter-0.2-1.9.aarch64.rpm"
RPM_HASH = "bdd739e8ed52e8d9b9eb662370481ba062c7852681c7443b44fb5993cf29652808cd1f96de03f34602a2852334ffa8456b1a834901343cf18f98027b2e592a04"

RPROVIDES:${PN} += "prometheus(saptune_exporter) \
prometheus-saptune_exporter \
prometheus-saptune_exporter(aarch-64) \
saptune_exporter"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
