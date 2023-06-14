SUMMARY = "Kea DHCP server configuration client library"
DESCRIPTION = "The Kea DHCP server can be managed at runtime via the Control \
Channel. The CC allows an external entity (e.g. a tool run by a \
sysadmin or a script) to issue commands to the server which can \
influence its behavior or retreive information from it. Examples \
envisioned are: reconfiguration, statistics retrieval and \
manipulation, and shutdown. \
 \
Communication over the Control Channel is conducted using JSON \
structures."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cfgclient36-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "73ec7ec73cd80ff8e70e18a6d3c68eb27809e5eabcdc13d00ec7f7950c51fd5bd0e45a8c015e8c93a51dd4e553314fae3badca4fae786483d775b8a7f65220d7"

RPROVIDES:${PN} += "libkea-cfgclient.so.36 \
libkea-cfgclient36"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-dhcp++.so.54 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-http.so.42 \
libkea-log.so.35 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
