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

RPM_NAME = "libkea-cfgclient36-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "5581c7e0421582a6ec6fdb7bb9f909f77e87d7f85e62a9c4e24da2cefafdfa291fa644b34a57e0f68353e05ddfbd9a6d0fbe6053fa95fa1c9fff525af7acdecf"

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
