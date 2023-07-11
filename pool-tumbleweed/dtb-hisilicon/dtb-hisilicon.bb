SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-hisilicon-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "8ea71e1b48449952c037f83c1fc932c02d452e8e38d6c3869ac24b4d1916b97c1c0ed7a2e3e434aeecf52483ef484550c0b311a54aad454f01ac825e3988296e"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
