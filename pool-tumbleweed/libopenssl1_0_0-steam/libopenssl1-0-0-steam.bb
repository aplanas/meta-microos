SUMMARY = "Secure Sockets and Transport Layer Security for steam"
DESCRIPTION = "OpenSSL is a software library to be used in applications that need to \
secure communications over computer networks against eavesdropping or \
need to ascertain the identity of the party at the other end. \
OpenSSL contains an implementation of the SSL and TLS protocols. \
 \
This subpackage is providing special patched edition for steam"
LICENSE = "OpenSSL"

PV = "1.0.2u"

RPM_NAME = "libopenssl1_0_0-steam-1.0.2u-22.1.aarch64.rpm"
RPM_HASH = "3a7f44791ed6e56e6f46aa0aa020c701b4edcd212ce497c38ce43879215f90b1ed2cecb170422e4ba9d031ebf27f876830fc32a57303b2827fb8629bce15fa09"

RPROVIDES:${PN} += "libopenssl1-0-0-steam"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.1.0.0 \
libz.so.1"

inherit rpm
