SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-allwinner-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "341e06d39c65c2f88def8d6850a325548a594e18593224c493f72a62d01fd8e5e9c39ffea4513ef2987bfca335d259956a3b67908b1c74558624f356fe22b39e"

RPROVIDES:${PN} += "dtb-allwinner \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
