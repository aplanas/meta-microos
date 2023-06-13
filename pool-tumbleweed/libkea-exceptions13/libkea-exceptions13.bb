SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-exceptions13-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "b5c30fa2c2a06cfa837d880420756990cf57a17f7819cfaa6d59932cce093b25364d2bf57e04d97ef89e84662673c8fb6a94e7366e057904548cab8e99ce7b24"

RPROVIDES:${PN} += "libkea-exceptions.so.13()(64bit) \
libkea-exceptions13 \
libkea-exceptions13(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
