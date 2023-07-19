SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-exynos-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "a54217b2d2f3fc69edd518bcfd248cad758411939ec6852b0d1e40a83222aff124c4137e1d538433437f605ca970c6ea6562183d606af1e1a508faa29fc14c98"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
