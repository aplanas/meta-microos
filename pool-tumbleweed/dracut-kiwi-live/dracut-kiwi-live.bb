SUMMARY = "KIWI - Dracut module for iso(live) image type"
DESCRIPTION = "This package contains the kiwi-live dracut module which is used \
for booting iso(live) images built with KIWI"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-live-9.24.61-1.1.aarch64.rpm"
RPM_HASH = "137ca1a076cd13db3dea4f0326b7db26f16355c9fcd163bc45ac52bce9f9bd22b0bed3a1ccfe12154bb96aaa18f44f66dfd0d8ce603353eec063fb1b2a68a5a2"

RPROVIDES:${PN} += "dracut-kiwi-live \
dracut-kiwi-live(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
device-mapper \
dialog \
dracut \
e2fsprogs \
util-linux \
util-linux-systemd \
xfsprogs \
xorriso"

inherit rpm
