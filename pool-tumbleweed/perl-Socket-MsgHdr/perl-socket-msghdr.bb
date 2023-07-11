SUMMARY = "Sendmsg, Recvmsg and Ancillary Data Operations"
DESCRIPTION = "Socket::MsgHdr provides advanced socket messaging operations via sendmsg \
and recvmsg. Like their C counterparts, these functions accept few \
parameters, instead stuffing a lot of information into a complex structure. \
 \
This structure describes the message sent or received (buf), the peer on \
the other end of the socket (name), and ancillary or so-called control \
information (cmsghdr). This ancillary data may be used for file descriptor \
passing, IPv6 operations, and a host of implemenation-specific extensions."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.05"

RPM_NAME = "perl-Socket-MsgHdr-0.05-1.25.aarch64.rpm"
RPM_HASH = "d77fc88df78da1a903eec5f2469b2c5a2392cda95cdca3689814a3f794f6e6cfca5ac73b089156f26ca71121f24805e4e44be7385ed41156f53afd78af4d4470"

RPROVIDES:${PN} += "perl-Socket--MsgHdr \
perl-Socket-MsgHdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
