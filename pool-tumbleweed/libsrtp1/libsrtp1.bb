SUMMARY = "Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
SRTP is a security profile for RTP that adds confidentiality, message \
authentication, and replay protection to that protocol. It is \
specified in RFC 3711. More information about the SRTP protocol \
itself can be found on the Secure RTP page."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libsrtp1-1.6.0-2.22.aarch64.rpm"
RPM_HASH = "46679ef5e266aa3b35ad4ddb5d5638b23744a151de7a3354d26fa0dad0be8cb49f27dec21219c6e6d542d613378c81121e7ab274a9e3ad0c22cc17c343d842ec"

RPROVIDES:${PN} += "libsrtp.so.1()(64bit) \
libsrtp1 \
libsrtp1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
