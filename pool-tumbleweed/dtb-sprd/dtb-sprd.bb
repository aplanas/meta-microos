SUMMARY = "Spreadtrum based arm64 systems"
DESCRIPTION = "Device Tree files for Spreadtrum based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-sprd-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "69a67d40b053158567474aa32925a3a415486f7f08bde78d64a747318f1d3ef1f536beb1262beb78fb7ce9365cd9fd6ef34470f2462fd0ff33f831cdd530de54"

RPROVIDES:${PN} += "dtb-sprd \
multiversion-dtb"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
