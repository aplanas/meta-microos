SUMMARY = "KIWI - Dracut module for iso(live) image type"
DESCRIPTION = "This package contains the kiwi-live dracut module which is used \
for booting iso(live) images built with KIWI"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "dracut-kiwi-live-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "4d9f6ebfb050d12c6cd82fb9a4eddcb700d2176c7277ff8d354f3c1323244b88cdd1f46598e16a057a66c2a6f881874b3bb76c4adde3ff609fd609845d3c0cb0"

RPROVIDES:${PN} += "dracut-kiwi-live dracut-kiwi-live(aarch-64)"
RDEPENDS:${PN} += "/bin/bash device-mapper dialog dracut e2fsprogs parted util-linux util-linux-systemd xfsprogs xorriso"

inherit rpm
