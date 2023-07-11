SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "dtb-rockchip-6.3.9-1.1.aarch64.rpm"
RPM_HASH = "9e9cba2a6dab169f2083dbc106949059cff19efaf93b35e844d9ed53ab0fb84524d667b352743d75984244e07ae36f0e44b5cdf5036733169311ae4c2cd493fb"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
