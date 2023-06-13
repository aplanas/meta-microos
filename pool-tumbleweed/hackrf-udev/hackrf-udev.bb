SUMMARY = "Udev rules for HackRF"
DESCRIPTION = "Udev rules for HackRF."
LICENSE = "GPL-2.0-only"

PV = "2023.01.1"

RPM_NAME = "hackrf-udev-2023.01.1-1.2.aarch64.rpm"
RPM_HASH = "b92f2a7735876e00060ec5b509229bc3330b6bbeb1e981180aca4e2d5bda7eb93253903750cd865f4bc702e3ee5437a45bca28a2adeeafb83f5767fe3d601087"

RPROVIDES:${PN} += "hackrf-udev \
hackrf-udev(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
shadow"

inherit rpm
