SUMMARY = "Kea I/O utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-util-io0-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "3d3e2d2e8646ede51ef49e0388d281f5564db12e2bbd3e86931bef0ed9fb663da9949f2dca27a66011cc55deefb2865fb20be588e0692cb22e82daa26ad49372"

RPROVIDES:${PN} += "libkea-util-io.so.0 \
libkea-util-io0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.13 \
libstdc++.so.6"

inherit rpm
