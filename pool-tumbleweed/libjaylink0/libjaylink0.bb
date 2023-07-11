SUMMARY = "USB interface library for J-Link"
DESCRIPTION = "Library for accessing Segger J-Link USB devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink0-0.3.1-1.3.aarch64.rpm"
RPM_HASH = "ef581444a50396637e434ee5241e1be10bb829e65b334c2f6b3a403725dbc38113636744504f7b2dadf78afe06f4ba45af459f8f374356aee06f1f55f7fb3985"

RPROVIDES:${PN} += "libjaylink.so.0 \
libjaylink0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
