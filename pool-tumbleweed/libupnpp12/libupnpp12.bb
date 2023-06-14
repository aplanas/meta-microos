SUMMARY = "Library providing a higher level C++ API over libnpupnp or libupnp"
DESCRIPTION = "Libupnpp is a C++ wrapper for libupnp a.k.a Portable UPnP (up to branch 0.17), \
or its C++ descendant, libnpupnp (versions 0.18 and later). \
 \
Libupnpp can be used to implement UPnP devices and services, or Control Points. \
The Control Point side of libupnpp, which is documented here, \
allows a C++ program to discover UPnP devices, and exchange commands and status with them."
LICENSE = "GPL-2.0-or-later"

PV = "0.22.2"

RPM_NAME = "libupnpp12-0.22.2-1.3.aarch64.rpm"
RPM_HASH = "b22634a20bec549b2c782cbd10ffff8926350d580355b5d61b86d8ff9d9022d76bd810549c1c3306653187d7c469d3a654ca7a816bd0d12c1ddb2c0af2ab9ab0"

RPROVIDES:${PN} += "libupnpp.so.12 \
libupnpp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libnpupnp.so.9 \
libstdc++.so.6"

inherit rpm
