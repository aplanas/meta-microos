SUMMARY = "Kea DHCP server command channel library"
DESCRIPTION = "libkea-cc is used for the control channel protocol between keactrl \
and the server."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cc39-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "27e19b596a4cb408818ae42500dbe4b8d279f5ced95cca6525dcc7dee3526ae21c11e2188169264fd2cd853d960c072e61adf22ee3f64f6f5c62cbcb5ffb3a18"

RPROVIDES:${PN} += "libkea-cc.so.39 \
libkea-cc39"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-exceptions.so.13 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
