SUMMARY = "A text-based WWW browser"
DESCRIPTION = "W3m is a pager and text-based WWW browser. It has a number of useful \
features: \
 \
* w3m can render tables \
 \
* w3m can render frames (it converts the frames into a table) \
 \
* SSL support \
 \
* w3m can easily display documents from standard input \
 \
* w3m can handle cookies \
 \
* w3m is small \
 \
* w3m has mouse support \
 \
If w3m-inline-image is installed it can display graphics inside \
terminals, even on the console on some platforms."
LICENSE = "ISC"

PV = "0.5.3+git20230121"

RPM_NAME = "w3m-0.5.3+git20230121-2.1.aarch64.rpm"
RPM_HASH = "3b8b5ccb2616c3a3f317731679e5e0ed1216fa8cd913dbdd000c2e059f0c453b3f6ffa5fd66fc938547cc6acc456974dfca7844879faf09b96edad37c5ac0ee5"

RPROVIDES:${PN} += "w3m \
w3m-ssl \
web-browser"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgc.so.1 \
libm.so.6 \
libssl.so.3 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
