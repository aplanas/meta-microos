SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-arm-none-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "1b57945d5c244836d6675e6c318393e40f9a13aa86212f0dfdfc12d96860e5700f1ed5412f555db27d5a587f344b60ff1fd1c73cb117b2c1176fae33de5cb358"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
