SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-arm-none-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "30f24353f4ea5cc691bb9c90eb087373069eb798a8f5bc37dee61b44dccccb5864916a47a94ea23917dbd33029ee62923f885e475873618484f0f8c3ddb8f583"

RPROVIDES:${PN} += "arm-none-eabi-gcc cross-arm-none-gcc13 cross-arm-none-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
