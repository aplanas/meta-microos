SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC library. LIRC is a package that supports receiving \
and sending IR signals with the most common IR remote controls."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc0-0.10.1-10.2.aarch64.rpm"
RPM_HASH = "286764d2e14bd6b53164907c762eb41a9d5a2e4bbd4d3cf061efeabbd8205facdf2122fede2c115a0d9115d4fbd85ec53d4b5619c39ae451d39b55e1d5ee5543"

RPROVIDES:${PN} += "liblirc.so.0 \
liblirc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
