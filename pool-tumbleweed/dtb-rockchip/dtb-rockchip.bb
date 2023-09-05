SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "dtb-rockchip-6.4.12-1.1.aarch64.rpm"
RPM_HASH = "a14ae7f04e91ebff52b626c1e582b90ecfb12f2e4e9bb1afc6f92dceadddf913aa37875ba2c66713c8218e854beaa09b49e9d493deaabf5be422b65d86f265b5"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
