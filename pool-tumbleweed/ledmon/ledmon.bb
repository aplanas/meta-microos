SUMMARY = "Enclosure LED Utilities"
DESCRIPTION = "The ledctl application and ledmon daemon are part of Intel(R) LED \
ControlUtilities. They help to enable LED management for software RAID \
solutions."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "0.97"

RPM_NAME = "ledmon-0.97-1.2.aarch64.rpm"
RPM_HASH = "4c072861e5afa4483ffab603a253d75aafbe6a8126cfcf730678bd9bb1623f2009b64d93e7c4d062dbaa3d2797b8d0d0033b8dad28de0a527fe881582be297ac"

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
