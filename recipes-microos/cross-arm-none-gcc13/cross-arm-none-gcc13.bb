SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-none-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "d467c3f70ace7e4f502dda7028f0e5f8ecc6642c22e00aa3b7ac13b5a2c840c169ec91409f71dc66246c4e2aa19d6575a56dc92a2fce6882811ef38e2c0dbf51"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13 \
cross-arm-none-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
