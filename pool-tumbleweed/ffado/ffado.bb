SUMMARY = "FireWire 1394 support for audio devices, svn snapshot"
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

PV = "2.4.3"

RPM_NAME = "ffado-2.4.3-3.1.aarch64.rpm"
RPM_HASH = "ef164197e0031deee40fbf28589c7618fd734bac4499b22897b2b2eba038a9746e6f67afd595683f0bd0c02f4f5de7f9e86266ea3a16340b8084bcd844914ef0"

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
