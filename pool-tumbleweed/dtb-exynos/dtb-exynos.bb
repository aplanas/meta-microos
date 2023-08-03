SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-exynos-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "887e916dc29bcf0ec0bc5905a7fb0cb2eb592ee6bf9b23ab88e2b07e98978f262bf8beb46dcf2d978f7cec46e4eb2242820b4d3e75fcba75d0e3e6d88fe970f8"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
