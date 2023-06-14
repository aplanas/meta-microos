SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "BoringSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols, derived from OpenSSL."
LICENSE = "OpenSSL"

PV = "20200921"

RPM_NAME = "libboringssl1-20200921-2.7.aarch64.rpm"
RPM_HASH = "d4e65d20dc664f53033c2dd6a082deb23f244e0b49d55aba95647e2f4e1ab89eaff3a1f84ed13f2955da26d03d011c886c042d15d5bada603bcc0ac8467651cb"

RPROVIDES:${PN} += "libboringssl-crypto.so.1 \
libboringssl-ssl.so.1 \
libboringssl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
