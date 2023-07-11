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

RPM_NAME = "libsrtp1-1.6.0-2.23.aarch64.rpm"
RPM_HASH = "2dd7dcee2b522c2ec434285e8729fdfdc9cb6c56dabfc369f8d0467f5c4b483dff0dbab60172f13d8ed4b2229e361a1e190682f9e2e74effa66ca6f88917bd68"

RPROVIDES:${PN} += "libsrtp.so.1 \
libsrtp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
