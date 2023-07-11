SUMMARY = "Prometheus exporter for Slurm metrics"
DESCRIPTION = "Prometheus collector and exporter for metrics extracted from the Slurm \
resource scheduling system."
LICENSE = "GPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "golang-github-vpenso-prometheus_slurm_exporter-0.20-1.1.aarch64.rpm"
RPM_HASH = "9a10ee86c7961351937a10a1ff5d5cc71be7fe8747135e158a7d921e3eba2ffd89e666d95ce05d170309b7f84fbefed67c9e83ab5411a0d3cd540697428dfab5"

RPROVIDES:${PN} += "golang-github-vpenso-prometheus-slurm-exporter"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/sinfo \
/usr/bin/squeue \
shadow \
systemd"

inherit rpm
