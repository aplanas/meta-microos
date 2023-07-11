SUMMARY = "PulseAudio commandline mixer"
DESCRIPTION = "pamixer is like amixer but for PulseAudio. It can control the volume levels \
of the sinks."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "pamixer-1.6-1.4.aarch64.rpm"
RPM_HASH = "0cf9f91a78aac86464b647abbba9d7069f9d3b0c51dced8139346a637fa20383e3d29150d58200cf54249c5de853517f5fe736f4c07964524633082e323abc45"

RPROVIDES:${PN} += "pamixer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
