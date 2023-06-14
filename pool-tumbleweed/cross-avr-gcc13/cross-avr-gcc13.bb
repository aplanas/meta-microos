SUMMARY = "The GNU Compiler Collection targeting avr"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting avr."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-avr-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "02e39c3e85096e23a49597acabc4bdb8b295802d0279c5f6345c2dbe6fd7675e6e81628eaa1eb24c28b3d0d1bfb0c467cc126fe78b1700353f797efef7f254b9"

RPROVIDES:${PN} += "cross-avr-gcc13"

RDEPENDS:${PN} += "/bin/sh \
cross-avr-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
