SUMMARY = "Development files for Usenet cancel lock library"
DESCRIPTION = "libcanlock is a library for creating and verifying RFC 8315 Netnews \
Cancel-Locks. This implementation uses the recommended algorithm from \
Section 4 with HMAC based on the same hash function as <scheme>. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcanlock."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "libcanlock-devel-3.3.0-1.3.aarch64.rpm"
RPM_HASH = "9c92510dd50229cc6a643eb06bfee22b1bfb8ed915e43ab5038966dfa1e567f0f394391dc0d037ab98e9d4e6c7a68718889008ade609d009964dd9b83674ad2b"

RPROVIDES:${PN} += "libcanlock-devel \
libcanlock-devel(aarch-64) \
pkgconfig(libcanlock-3) \
pkgconfig(libcanlock-hp-3)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcanlock3"

inherit rpm
