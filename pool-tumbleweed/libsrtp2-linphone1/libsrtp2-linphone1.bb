SUMMARY = "Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
SRTP is a security profile for RTP that adds confidentiality, message \
authentication, and replay protection to that protocol. It is \
specified in RFC 3711. More information about the SRTP protocol \
itself can be found on the Secure RTP page."
LICENSE = "BSD-3-Clause"

PV = "2.2.0~git.20210916"

RPM_NAME = "libsrtp2-linphone1-2.2.0~git.20210916-1.9.aarch64.rpm"
RPM_HASH = "747912d25a0899c3a85e9ecc92b89ac2742181c448a2fc1b753309f9da0f872a17cceca318847e338fdf48de5ff15e29e965889ab2a83ef887bcd3f85675c47e"

RPROVIDES:${PN} += "libsrtp2-linphone.so.1()(64bit) \
libsrtp2-linphone1 \
libsrtp2-linphone1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
