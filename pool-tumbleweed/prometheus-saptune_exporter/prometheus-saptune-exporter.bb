SUMMARY = "Prometheus exporter for saptune metrics"
DESCRIPTION = "Prometheus exporter for Saptune metrics"
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "prometheus-saptune_exporter-0.2-1.10.aarch64.rpm"
RPM_HASH = "a60fd79d662dc0c4524de0096a7901f0b42b43305ae2d1f4fc25027ddeaaf25d6d84ad0176cd53c14016a6e25c42d846d20f2ffe7847656b5f054a80c603f791"

RPROVIDES:${PN} += "prometheus-saptune-exporter \
saptune-exporter"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
