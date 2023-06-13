SUMMARY = "Utilities for creating and verifying Usenet cancel locks"
DESCRIPTION = "Cancel locks are used by Usenet article posters to authenticate their \
authorship of an article. It may then by used by servers to prevent \
cancel and supersede abuse. The use of this feature remains the \
newsmaster's decision. \
 \
This package contains a simple utility wrapping the canlock library, \
which may be used for both the generation and the verification of \
cancel locks, along with a message header parser and a header field \
parser."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "canlock-3.3.0-1.3.aarch64.rpm"
RPM_HASH = "17895a13eea3a481587aa2d3c0a4ca308a1c30a3a02a2f167fbd2e9a0ba4df2a8fda4903e45aa14e8a27971b5edaf2b7c0cf220fa2d6e5fddfa234e54496cb02"

RPROVIDES:${PN} += "canlock \
canlock(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcanlock.so.3()(64bit)"

inherit rpm
