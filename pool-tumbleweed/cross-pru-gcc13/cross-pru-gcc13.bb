SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-pru-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "07af221a74e4e28595e55542a906457e06fe4b5005902df7f24621e842a0741dd027529621036375e4e23d00b81d2c0006cbedfcfb82b84d44395ec61c4a1d39"

RPROVIDES:${PN} += "cross-pru-gcc13 \
pru-gcc"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-pru-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
