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

RPM_NAME = "libsrtp2-linphone1-2.2.0~git.20210916-1.10.aarch64.rpm"
RPM_HASH = "5e588ccef5a889ea0a4dca77ab652c4a79e6ae6cec0eff5c500c74e8039ec60ff675a9066d9d19cb829218eb5f53e5c9ba530c2f64250db993d2a683f5c25e00"

RPROVIDES:${PN} += "libsrtp2-linphone.so.1 \
libsrtp2-linphone1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
