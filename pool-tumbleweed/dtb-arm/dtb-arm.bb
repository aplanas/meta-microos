SUMMARY = "ARM Ltd. based arm64 systems"
DESCRIPTION = "Device Tree files for ARM Ltd. based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-arm-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "c921744e56284a87dc0a62a37952b78ce9a51dad56625634aa3ca2ffcc6040bbb7cdf4e9767e07a170c7c356563e8694b9624ccd3973726a2c51b1f3e7fe87b5"

RPROVIDES:${PN} += "dtb-arm \
dtb-foundation-v8 \
dtb-rtsm-ve-aemv8a \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
