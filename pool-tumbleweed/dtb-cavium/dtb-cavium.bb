SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-cavium-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "dca6be5da37bb6760627fa92370c61cc0b6e966b86afb3812533a7f15f65d91703f3304efbe48a514402f6e9f02e12e4347faf78751bb6c33203d7a009b964a8"

RPROVIDES:${PN} += "dtb-cavium \
dtb-thunder-88xx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
