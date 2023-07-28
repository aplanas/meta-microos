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

PV = "2.4.0"

RPM_NAME = "libkea-cfgclient51-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "e29ba32f8368a18a3019388a8bc70582d779587e527efceba9b414c9ddf2eed6c163926048489de83b10e3062ef9d88a21457ea596bfcef2545a6cb273b724d9"

RPROVIDES:${PN} += "libkea-cfgclient.so.51 \
libkea-cfgclient51"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-cryptolink.so.38 \
libkea-dhcp++.so.73 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-http.so.56 \
libkea-log.so.48 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
