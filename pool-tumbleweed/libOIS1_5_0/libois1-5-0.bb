SUMMARY = "Object Oriented Input System development package"
DESCRIPTION = "Object Oriented Input System (OIS) is a solution for using all kinds \
of Input Devices (Keyboards, Mice, Joysticks, etc) and feedback \
devices (e.g. forcefeedback)."
LICENSE = "Zlib"

PV = "1.5.1"

RPM_NAME = "libOIS1_5_0-1.5.1-1.8.aarch64.rpm"
RPM_HASH = "a2384b703a3c604ba89ae953b1899908ba7d0b84d2d8b56c9f1e3c802d578d7c109d92ee6586b2dbfeb4b06be04703a7868c31ed029e3b40dd2c94c7c0bdabe2"

RPROVIDES:${PN} += "libOIS.so.1.5.0 \
libOIS1-5-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
