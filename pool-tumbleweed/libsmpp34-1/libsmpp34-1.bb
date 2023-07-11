SUMMARY = "SMPP-3.4 protocol library"
DESCRIPTION = "This library provides the Protocol Data Unit (PDU) handling of the \
SMPP-3.4 protocol. SMPP (Short Message Peer-to-Peer) is a protocol \
providing a data communication interface for the transfer of short \
message data between External Short Messaging Entities, Routing \
Entitites and Message Centres."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.2"

RPM_NAME = "libsmpp34-1-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "e2a31764d41a80c571102b37c4342e3c29d2c354a5aeb9f6a851ada27ef95d5cffa90331e063aea5bad44234b5461070bdf80592a40c7030d69342487988be8a"

RPROVIDES:${PN} += "libsmpp34-1 \
libsmpp34.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
