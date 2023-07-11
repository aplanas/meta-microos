SUMMARY = "Samsung Exynos based arm64 systems"
DESCRIPTION = "Device Tree files for Samsung Exynos based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-exynos-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "350b96d75746582c29f1a8fb048fc3663f186442ac1f33b096e8583541fd072ca0a5cf3d8f6200ba82f93571ac8bf24c973a88d810949e92b08f69ee2ca00c76"

RPROVIDES:${PN} += "dtb-exynos \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
