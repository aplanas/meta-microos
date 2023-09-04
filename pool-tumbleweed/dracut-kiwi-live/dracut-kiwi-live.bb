SUMMARY = "KIWI - Dracut module for iso(live) image type"
DESCRIPTION = "This package contains the kiwi-live dracut module which is used \
for booting iso(live) images built with KIWI"
LICENSE = "GPL-3.0-or-later"

PV = "9.25.12"

RPM_NAME = "dracut-kiwi-live-9.25.12-1.1.aarch64.rpm"
RPM_HASH = "a5613c91e59e7a8b3b7ca5afe7f924d382d65fdacbd3a459ab0b733261209bad317c36581e8c6b190edbb8cee86031cfe7d0ad5d563dec3a00f857e03d062291"

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
