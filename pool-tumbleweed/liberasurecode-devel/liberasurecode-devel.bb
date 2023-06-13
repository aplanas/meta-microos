SUMMARY = "Development files for liberasurecode"
DESCRIPTION = "Development files for the Unified Erasure Coding interface."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "liberasurecode-devel-1.6.3-1.5.aarch64.rpm"
RPM_HASH = "856f1d6cc0cda65bce8dc805a7f390265a0d2cc926f8ccad1d7028a9877eb4bf0e63f3e84b6501b5e916e4c94ff120c300f53a4ba082c21cffd2c33b41602877"

RPROVIDES:${PN} += "liberasurecode-devel \
liberasurecode-devel(aarch-64) \
pkgconfig(erasurecode-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liberasurecode1"

inherit rpm
