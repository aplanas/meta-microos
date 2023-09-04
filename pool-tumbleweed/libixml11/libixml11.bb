SUMMARY = "The Portable UPnP SDK's XML library"
DESCRIPTION = "A C XML parsing library originally created for the Intel UPnP SDK for Linux."
LICENSE = "BSD-3-Clause"

PV = "1.14.18"

RPM_NAME = "libixml11-1.14.18-1.1.aarch64.rpm"
RPM_HASH = "62bd16b29513b71b15c2a50a2c9d3259df2a703c7504e400e6d2a7f20b965bf9cb20adfa57d6d86d640b4f0946548f1dc062ae024f0af17166fcffc38b9d986b"

RPROVIDES:${PN} += "libixml.so.11 \
libixml11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
