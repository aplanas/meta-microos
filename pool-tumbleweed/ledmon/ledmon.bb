SUMMARY = "Enclosure LED Utilities"
DESCRIPTION = "The ledctl application and ledmon daemon are part of Intel(R) LED \
ControlUtilities. They help to enable LED management for software RAID \
solutions."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "0.97"

RPM_NAME = "ledmon-0.97-1.1.aarch64.rpm"
RPM_HASH = "85df7d500ff7010ba5da4c7770dc49d6fe67b4fdf3954d9e9e7948d87cddc47b9f2526d4c009aced797482a2aa78a3a1b1174f37ba1861f93b5534e9559092ef"

RPROVIDES:${PN} += "ledmon \
sgpio-/sbin/ledmon \
sgpio-/{/usr/bin}/ledctl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpci.so.3 \
libsgutils2-1.48.so.2 \
libudev.so.1 \
systemd"

inherit rpm
