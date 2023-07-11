SUMMARY = "FireWire 1394 support for audio devices"
DESCRIPTION = "FFADO aims to provide a generic, open-source solution \
to support FireWire(IEEE1394, iLink) based (semi-) \
professional audio interfaces. \
It's the successor of the FreeBoB project. FFADO is a \
volunteer-based community effort, trying to provide Linux \
with at least the same level of functionality that is \
present on the other operating systems. \
The range of FireWire Audio Devices that we would like \
to support is broad: from pure audio interfaces over \
mixed audio-control devices to DSP algorithm devices. \
This is a snapshot of svn revision 1855"
LICENSE = "GPL-2.0-or-later"

PV = "2.4.7"

RPM_NAME = "ffado-2.4.7-1.1.aarch64.rpm"
RPM_HASH = "97bd4ff5df16ab09050c7081971c60676f37f2e8cb885961a8042004043926084e72bd9e997831a62cd5d871a5336d4a3b63a13b6d8495bb34e9ffec51440a73"

RPROVIDES:${PN} += "ffado"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libdbus-c++-1.so.1 \
libffado.so.2 \
libffado2 \
libgcc-s.so.1 \
libiec61883.so.0 \
libm.so.6 \
libraw1394.so.11 \
libstdc++.so.6"

inherit rpm
