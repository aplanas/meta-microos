SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-rockchip-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "69898212549a40eb56ae84971149d943b77b18b301e094bef2ee350ed2b0cbe1908331c5da152c9b1a3680b7224e3db1a5be710c2f974626607c94fbed92a1a6"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
