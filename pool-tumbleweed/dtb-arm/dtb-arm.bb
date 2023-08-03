SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-arm-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "4e84c5284b0db093cff91e3ce33e170dac28b550e15dc2dd090d8ac926bb06d136e54fc032bf0bffddb656bcda00808830afc132045fa48f9df97f60f5419194"

RPROVIDES:${PN} += "dtb-arm \
dtb-foundation-v8 \
dtb-rtsm-ve-aemv8a \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
