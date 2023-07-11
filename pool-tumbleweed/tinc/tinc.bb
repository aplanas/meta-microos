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

RPM_NAME = "tinc-1.0.36-3.3.aarch64.rpm"
RPM_HASH = "ff657faef5b07141f3d242fe60a09399bcc4c985073b56a184b982257b03b37640a3aed6a5ae63191a2a14cb2a8b0f904bdd1dff591e96fe6689e9169b3025bb"

RPROVIDES:${PN} += "tinc"

RDEPENDS:${PN} += "/usr/bin/sh \
info \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzo2.so.2 \
libz.so.1"

inherit rpm
