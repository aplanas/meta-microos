SUMMARY = "A C++ base UPnP library, derived from Portable UPnP, a.k.a libupnp"
DESCRIPTION = "A C++ base UPnP library, derived from Portable UPnP, a.k.a libupnp"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "libnpupnp9-5.0.0-1.4.aarch64.rpm"
RPM_HASH = "9825363addad8dbff479f10c018b7c5244311cda40371a98346d95b90164838c296b0e2c94eaa408c728a80da0ad0c609fc4fa886d83d5513a341eec2de4c315"

RPROVIDES:${PN} += "libnpupnp.so.9 \
libnpupnp9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libmicrohttpd.so.12 \
libstdc++.so.6"

inherit rpm
