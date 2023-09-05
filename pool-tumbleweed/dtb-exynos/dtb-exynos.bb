SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-exynos-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "522ed597159f7526582d4b8a9be5865480ce31380852b41c68abd7ee7e61b41e0794f78bc20ad2822001591a81c66fbf5381ec86c5aa744baefb6a7b0605dda9"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
