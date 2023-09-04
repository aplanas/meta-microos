SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-exynos-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "fdabf7749aa9f4c5d3aa252e8a8a0121ff6e8a5d3f5e4c761f9013c75f9f5fc5bcc124eb216cae29a4ab29a7337e9986913a2c0387e8ce70a3dca20b74d4b58c"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
