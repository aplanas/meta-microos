SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-arm-none-gcc13-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "f5b3b00dfb53969de8d60cbd428e40fb2a9ecc499f606b1e99a6e8af6d4c18be6e0ee1225f48c5d971aba0db3751b16d6a8664ebe2e1dfcc8b478741435d87aa"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
