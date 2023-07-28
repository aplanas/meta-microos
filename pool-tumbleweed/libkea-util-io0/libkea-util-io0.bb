SUMMARY = "Kea I/O utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "libkea-util-io0-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "c79a02d54031b1bb0954a40f47f6589a52eca488e04f377aac8c8e11785c59970cd4d25e7a15ff08c07ba0e4268eafd393abadf08329d6e86520f1d50eb6f686"

RPROVIDES:${PN} += "libkea-util-io.so.0 \
libkea-util-io0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.23 \
libstdc++.so.6"

inherit rpm
