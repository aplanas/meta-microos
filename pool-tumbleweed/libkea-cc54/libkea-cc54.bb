SUMMARY = "Kea DHCP server command channel library"
DESCRIPTION = "libkea-cc is used for the control channel protocol between keactrl \
and the server."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-cc54-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "5047e41e4778e0eb7fd82a8e8d3723b44580c6ad7f2ace1efeb18bc0e72691780ea3de5c1628d40ae2d0987c352bcb1e6eb87ca2111b03575e828cdafc4c867f"

RPROVIDES:${PN} += "libkea-cc.so.54 \
libkea-cc54"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-exceptions.so.23 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
