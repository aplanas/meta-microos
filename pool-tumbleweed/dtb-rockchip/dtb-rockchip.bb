SUMMARY = "Rockchip based arm64 systems"
DESCRIPTION = "Device Tree files for Rockchip based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "dtb-rockchip-6.4.11-1.2.aarch64.rpm"
RPM_HASH = "09bc3894372938dcb0b1ad9b08221e80684b67251137445a348b9ed6a54dc187062e2e620406f8e9482f7847450968a24247d561ba541e95ef86001421b0d1ad"

RPROVIDES:${PN} += "dtb-rockchip \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
