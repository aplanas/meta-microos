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

RPM_NAME = "perl-Socket-MsgHdr-0.05-1.26.aarch64.rpm"
RPM_HASH = "cf7e00c74800a6223a757d390b01d8dac6b3c13f7fb79188e9a262103e7c59236a520136ddd48327d88df56408a6efcccaebd95d2908f0e405bd2ce63d094c2e"

RPROVIDES:${PN} += "perl-Socket--MsgHdr \
perl-Socket-MsgHdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
