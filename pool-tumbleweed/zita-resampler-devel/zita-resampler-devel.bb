SUMMARY = "Development files for zita-resampler"
DESCRIPTION = "Development files for zita-resampler including headers and libraries."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "zita-resampler-devel-1.8.0-1.10.aarch64.rpm"
RPM_HASH = "601ca294d3001d70e497a3279074c6b79ab720b968f8aa0360b574bec9141ad068b473298a27d4db503064ad54fb2254ed18b126b830425896d95038dacd9287"

RPROVIDES:${PN} += "zita-resampler-devel \
zita-resampler-devel(aarch-64)"
RDEPENDS:${PN} += "libzita-resampler1"

inherit rpm
