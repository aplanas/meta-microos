SUMMARY = "KIWI - Dracut module for iso(live) image type"
DESCRIPTION = "This package contains the kiwi-live dracut module which is used \
for booting iso(live) images built with KIWI"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.61"

RPM_NAME = "dracut-kiwi-live-9.24.61-1.2.aarch64.rpm"
RPM_HASH = "ea32816407f1363f1547c2f5ebd86ea7affe42ededb69f8e05536382243f83895b0fe3caac7a43924dcc424c8257a40696dbad50a58aa03c7ecbbc444bad545b"

RPROVIDES:${PN} += "dracut-kiwi-live"

RDEPENDS:${PN} += "/usr/bin/bash \
device-mapper \
dialog \
dracut \
e2fsprogs \
util-linux \
util-linux-systemd \
xfsprogs \
xorriso"

inherit rpm
