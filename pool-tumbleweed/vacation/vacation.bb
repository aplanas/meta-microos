SUMMARY = "A way to automatically reply to incoming e-mail"
DESCRIPTION = "This program answers your e-mail when you are lying on the beach. \
 \
Documentation: man vacation \
 \
 \
 \
Authors: \
-------- \
    Sean F Rima <sean.rima@tcob1.uklinux.net> \
    Eric P. Allman \
    Harald Milz <hm@seneca.muc.de>"
LICENSE = "GPL-2.0+"

PV = "1.2.7.1"

RPM_NAME = "vacation-1.2.7.1-13.2.aarch64.rpm"
RPM_HASH = "f2e93877e8beb7bd3a6c2ec5f122e64bf799e6ac5a6c61fe50e4f6dff64683b7a10dc9f9e305d5b90d21f5794c6ec97ecdb54921e75b8e14430d4dd6ab61d92e"

RPROVIDES:${PN} += "vacation \
vacation(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdbm.so.6()(64bit)"

inherit rpm
