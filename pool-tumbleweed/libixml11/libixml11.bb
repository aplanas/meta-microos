SUMMARY = "The Portable UPnP SDK's XML library"
DESCRIPTION = "A C XML parsing library originally created for the Intel UPnP SDK for Linux."
LICENSE = "BSD-3-Clause"

PV = "1.14.17"

RPM_NAME = "libixml11-1.14.17-1.2.aarch64.rpm"
RPM_HASH = "2872de7019da748b3c771273c46edbfbb3cf5d340fdca8bf91d24b4aaad1b97996007cc51b61e0d99d5411a558f42a31583d26d4bdac72185af1ce6b7321dbd6"

RPROVIDES:${PN} += "libixml.so.11 \
libixml11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
