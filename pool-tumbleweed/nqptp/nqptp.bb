SUMMARY = "Not Quite PTP"
DESCRIPTION = "nqptp is a daemon that monitors timing data from any PTP clocks – up to 64 – it \
sees on ports 319 and 320. It maintains records for each clock, identified by \
Clock ID and IP. \
 \
It is a companion application to Shairport Sync and provides timing information \
for AirPlay 2 operation."
LICENSE = "GPL-2.0-only"

PV = "1.2.1"

RPM_NAME = "nqptp-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "8304aafe88d4d85de025195ac35086c21dda3f25599d998030fdf70c8c7975b1d77bbe49144dbd9498522bdf018a6aac4ddc7fd5b78bf4651864c3284d99af90"

RPROVIDES:${PN} += "nqptp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
