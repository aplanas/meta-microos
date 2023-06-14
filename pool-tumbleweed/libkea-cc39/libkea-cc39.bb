SUMMARY = "Kea DHCP server command channel library"
DESCRIPTION = "libkea-cc is used for the control channel protocol between keactrl \
and the server."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cc39-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "710e9315213e6b075c255f19ab99e74f0a62e33638f447325f882d82bf373df16629adc56fd0de343a26df6c7284dfce545cd5c1daf83037e7b4d3e014c08e9c"

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
