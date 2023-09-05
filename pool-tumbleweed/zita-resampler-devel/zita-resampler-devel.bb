SUMMARY = "Development files for zita-resampler"
DESCRIPTION = "Development files for zita-resampler including headers and libraries."
LICENSE = "GPL-3.0-or-later"

PV = "1.11.2"

RPM_NAME = "zita-resampler-devel-1.11.2-1.1.aarch64.rpm"
RPM_HASH = "ef2d7f53365d383e727da81ca89d7f5af0a8b531ed039220e2db7cd87a67a56efa7de93c4ece550f29bca810c69efa7063057a2d3f904e5f393271432d28eaad"

RPROVIDES:${PN} += "zita-resampler-devel"

RDEPENDS:${PN} += "libzita-resampler1"

inherit rpm
