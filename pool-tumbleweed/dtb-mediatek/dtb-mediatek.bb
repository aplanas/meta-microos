SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "dtb-mediatek-6.4.6-1.1.aarch64.rpm"
RPM_HASH = "f8df34a9bf51784dbd8a28c2811f88b8ed95bcc346d989e15792d87902ed23b7d1cbe2e4814391f2ff910ec833cc746f99275a3bff2426216c4bc7d739e6c8a3"

RPROVIDES:${PN} += "dtb-mediatek \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
