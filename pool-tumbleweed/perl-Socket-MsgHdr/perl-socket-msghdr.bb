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

RPM_NAME = "perl-Socket-MsgHdr-0.05-1.24.aarch64.rpm"
RPM_HASH = "93f631e863c16b9c0c23d610daa54fa089f8fa2ed852ecb1a019e034a72902a9a726cbb6d6486357839521965b7412db2c2a984e1420fcef11bbea8ba94ab264"

RPROVIDES:${PN} += "perl-Socket--MsgHdr \
perl-Socket-MsgHdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
