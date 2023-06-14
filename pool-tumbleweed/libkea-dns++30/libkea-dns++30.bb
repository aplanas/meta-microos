SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-dns++30-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "20a47b99730425604930e6ff02a9d351e7b75076d0a52583ccfddb7258fab5e86fb936496313e8376c63da2d26004f426f21f4c8b36cfdd598b24047a26b55ec"

RPROVIDES:${PN} += "libkea-dns++.so.30 \
libkea-dns++30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cryptolink.so.28 \
libkea-exceptions.so.13 \
libkea-util.so.52 \
libstdc++.so.6"

inherit rpm
