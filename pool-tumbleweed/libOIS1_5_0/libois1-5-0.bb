SUMMARY = "Object Oriented Input System development package"
DESCRIPTION = "Object Oriented Input System (OIS) is a solution for using all kinds \
of Input Devices (Keyboards, Mice, Joysticks, etc) and feedback \
devices (e.g. forcefeedback)."
LICENSE = "Zlib"

PV = "1.5.1"

RPM_NAME = "libOIS1_5_0-1.5.1-1.9.aarch64.rpm"
RPM_HASH = "6438d923405d5c39c39e2e434089ab223bb23fea7e5c29bcd2a0a74afce0c8816e68f581e1f12ccea57d156ed1949673387a71bda5e4f9672245fcabdbc33dfd"

RPROVIDES:${PN} += "libOIS.so.1.5.0 \
libOIS1-5-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
