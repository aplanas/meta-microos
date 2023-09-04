SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-sprd-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "511ec33989206772263d4136f2646a0cab4da654de89c56629dfb5d6236d9e3a234e1824a672529b211c5bca560cdf78d104c8a2ef5d5cf711c5cfa84609acfe"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
