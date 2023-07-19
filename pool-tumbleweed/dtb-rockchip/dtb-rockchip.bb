SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-rockchip-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "6a4ad390863c560da80a50fec78fa329546ba648d9018d9355ee9d339e99c62796f50e7046770eb90bca47f8274b8ea4d607a847ac40e7605d041422d79e0d83"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
