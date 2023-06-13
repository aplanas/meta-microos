SUMMARY = "Kea DHCP server command channel library"
DESCRIPTION = "libkea-cc is used for the control channel protocol between keactrl \
and the server."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cc39-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "710e9315213e6b075c255f19ab99e74f0a62e33638f447325f882d82bf373df16629adc56fd0de343a26df6c7284dfce545cd5c1daf83037e7b4d3e014c08e9c"

RPROVIDES:${PN} += "libkea-cc.so.39()(64bit) \
libkea-cc39 \
libkea-cc39(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
