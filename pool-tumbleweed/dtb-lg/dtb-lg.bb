SUMMARY = "LG based arm64 systems"
DESCRIPTION = "Device Tree files for LG based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-lg-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "07f878904560c67f06b4b28982ec73831289aaece6cf9c220350ae14a8d54018029966f265ff9032b24d51e64a170b40947b2c572c8fd742af3714de0cc067d3"

RPROVIDES:${PN} += "dtb-lg \
dtb-lg(aarch-64) \
multiversion(dtb)"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
