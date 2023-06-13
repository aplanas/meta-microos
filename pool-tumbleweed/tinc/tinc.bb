SUMMARY = "A virtual private network daemon"
DESCRIPTION = "tinc is a Virtual Private Network (VPN) daemon that uses tunnelling \
and encryption to create a secure private network between hosts on \
the Internet. Because the tunnel appears to the IP level network \
code as a normal network device, there is no need to adapt any \
existing software. This tunnelling allows VPN sites to share \
information with each other over the Internet without exposing any \
information to others."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.36"

RPM_NAME = "tinc-1.0.36-3.2.aarch64.rpm"
RPM_HASH = "9031015669c4b6fcf0ad23d3bf4de61138249babd318d6692eabdc9fc5ca837d8845132317eac3288c60f2257c209f0223ae6a4e0740a3b76d00ec6c680da57a"

RPROVIDES:${PN} += "tinc \
tinc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
info \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
liblzo2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
