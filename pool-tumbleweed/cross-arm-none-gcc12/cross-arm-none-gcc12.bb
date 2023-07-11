SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-arm-none-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "226db2f83d725bdfc80e7be2dbf9765c015273abca03cde6c2db33ef558551ad83f7b1c51a7522e3a9f74ab779062c47e3a8d53dfee05380474500c3373e23bc"

RPROVIDES:${PN} += "arm-none-eabi-gcc \
cross-arm-none-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
