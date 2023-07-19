SUMMARY = "MediaTek based arm64 systems"
DESCRIPTION = "Device Tree files for MediaTek based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-mediatek-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "76a08f6a6c9f596e484eecd5945517ee833a339dfdba3f0e9c1b6a971963dea94ebdf6efb7cf2541dd01f3144a33460fd3b5cde0104ddddf3aaed2d17314608f"

RPROVIDES:${PN} += "dtb-mediatek \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
