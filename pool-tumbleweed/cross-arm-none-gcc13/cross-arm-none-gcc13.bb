SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-arm-none-gcc13-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "2c7762a06a3e1c563d6fc733f3b48a7100b627b24bc5c2b1b2dd2e0ba76f55cbfddd3d593e0706a6990229b89c40bcc105f85a1246b5440ae8f65b715c046344"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
