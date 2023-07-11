SUMMARY = "A C++ base UPnP library, derived from Portable UPnP, a.k.a libupnp"
DESCRIPTION = "A C++ base UPnP library, derived from Portable UPnP, a.k.a libupnp"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "libnpupnp9-5.0.0-1.5.aarch64.rpm"
RPM_HASH = "05cdf6ea4a3651e02fe34c3de0ed37722430edfec121ce42b96479a20fb38653dd0d60f84d9bf72f44f840bb79eff7b82c432fbe5114eea1fece2c66304c169a"

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
