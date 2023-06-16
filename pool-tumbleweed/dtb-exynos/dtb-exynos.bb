SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-exynos-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "5e427aaa22c4ff5ac86311a88abf7290f83f3541a4364860a0d405156a3d08354fceb2d05ebc6d68320d5d454fa4a461dfbe239150d234bbf4bf0854b70e668c"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
