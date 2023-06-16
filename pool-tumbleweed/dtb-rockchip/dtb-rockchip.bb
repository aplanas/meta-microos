SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-rockchip-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "5c5e1204ab9b21963e301ef87d2cc20cf135fc7f84b258027128c51e297ca3b4a8f3ec32cd6aad0d4355c6ca133c193bcdcd9d9fa2dbe217069b5d0c8a908ac3"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
