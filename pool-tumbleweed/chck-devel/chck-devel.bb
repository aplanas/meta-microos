SUMMARY = "Development files for chck"
DESCRIPTION = "Development files for Wayland Compositor Library."
LICENSE = "MIT"

PV = "0.0.20161208"

RPM_NAME = "chck-devel-0.0.20161208-1.26.aarch64.rpm"
RPM_HASH = "a1a8349863577e436dae14d88a2fecceef5ccb1d213e57badc3f15d2d525719cacf0b999932c626139286ec9d66d1df19af00a793243b977c551d77091221730"

RPROVIDES:${PN} += "chck-devel \
pkgconfig-chck"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake \
libchck0"

inherit rpm
