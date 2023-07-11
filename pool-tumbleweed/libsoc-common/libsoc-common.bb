SUMMARY = "Common files for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
It targets reliability rather than speed. No guarantees are made \
on its determinism and it should not be used in time critical routines. \
 \
This package contains common config files for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "libsoc-common-0.8.2-3.14.aarch64.rpm"
RPM_HASH = "18e6ee5e202371eaac387bb9604430f4169eb15b249afb0dc46b0f322ad3669267572d7ca0d7348afe6203cfac87ddc893c7908535a7157ac4e18d1cc45d0e3f"

RPROVIDES:${PN} += "libsoc-common"

RDEPENDS:${PN} += ""

inherit rpm
