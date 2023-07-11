SUMMARY = "Command-line utilties to manipulate IEEE1394 devices"
DESCRIPTION = "Command-line utilities to inspect and send IEEE 1394 isochronous \
packets, and to test the basic functionality of raw1394."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-tools-2.1.2-1.12.aarch64.rpm"
RPM_HASH = "bd3184ff66d2803e612fd09c48c51c2ee5e8a07bef98fc581e7ea364fee989be8854753018e7f8b5fc8d5bbfee032940603423821ff21faed920572657eaf2d6"

RPROVIDES:${PN} += "libraw1394 \
libraw1394-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libraw1394.so.11"

inherit rpm
