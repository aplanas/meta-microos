SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "dtb-exynos-6.4.2-1.1.aarch64.rpm"
RPM_HASH = "a2bc73eab047aafa11deba85e7d63cb91fc870213a89f4bd382bbc9cf334b73c4bbd0017f4f457532226b94656a0801159021aa0e6a0cdc8afa5ef010a94c7b0"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
