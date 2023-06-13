SUMMARY = "PulseAudio commandline mixer"
DESCRIPTION = "pamixer is like amixer but for PulseAudio. It can control the volume levels \
of the sinks."
LICENSE = "GPL-3.0-or-later"

PV = "1.6"

RPM_NAME = "pamixer-1.6-1.3.aarch64.rpm"
RPM_HASH = "767cb182d7ca6af391ba0140e8693790bf9ae90f856626a1393901e0b74218f54e0535e66993f1b21a87d35fceeec91765113e2ca5780ad09275308226b02082"

RPROVIDES:${PN} += "pamixer \
pamixer(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
