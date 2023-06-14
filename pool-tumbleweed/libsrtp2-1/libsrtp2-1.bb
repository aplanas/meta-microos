SUMMARY = "Secure Real-Time Transport Protocol (SRTP) library v2"
DESCRIPTION = "libsrtp is Cisco's implementation of the Secure Real-time Transport \
Protocol (SRTP), the Universal Security Transform (UST), and a \
supporting cryptographic kernel. \
 \
SRTP is a security profile for RTP that adds confidentiality, message \
authentication, and replay protection to that protocol. It is \
specified in RFC 3711. More information about the SRTP protocol \
itself can be found on the Secure RTP page."
LICENSE = "BSD-3-Clause"

PV = "2.5.0"

RPM_NAME = "libsrtp2-1-2.5.0-2.1.aarch64.rpm"
RPM_HASH = "d703f45726a2f29678f81d258c26d35bc121849e2561d510417931735c3c3fe2ae9ac8302e5ae3bdb640195fc9012ca9d3ce6c7a0cf9513faa60ec86df616174"

RPROVIDES:${PN} += "libsrtp2-1 \
libsrtp2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
