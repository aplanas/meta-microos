SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-lg-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "5d13a8336a452f92f074455b3ba67211197e7388a6caacf8732e6d561270bf253603a20a8de30e0424abeb0c035062b4c41c34168e27d24d63e4572d5e40a13b"

RPROVIDES:${PN} += "dtb-lg \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
