SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-exceptions13-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "9d756a05406632b9e3a66ad3ee7ffa78b18ec012bc664390f08e60a7f2288448a667ffc08aafbec6f8a9a7d41b8aae817d6ec3225bc602d2e59ee7f4736b7c0e"

RPROVIDES:${PN} += "libkea-exceptions.so.13 \
libkea-exceptions13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
