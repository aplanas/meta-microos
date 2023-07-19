SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-arm-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "0c8e5f944d61e90de2784a41887eb76b2a554ef936c6a5401e74b3d5525b50f3d02e5d5b014cfbbad7d884398191c98e0ca4efa748f01e02b1c14ba9caa02af4"

RPROVIDES:${PN} += "dtb-arm \
dtb-foundation-v8 \
dtb-rtsm-ve-aemv8a \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
