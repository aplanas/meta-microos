SUMMARY = "Send and receive multicast messages"
DESCRIPTION = "The IO::Socket::Multicast module subclasses IO::Socket::INET to enable \
you to manipulate multicast groups. With this module (and an operating \
system that supports multicasting), you will be able to receive \
incoming multicast transmissions and generate your own outgoing \
multicast packets. \
 \
 \
 \
Authors: \
-------- \
    Lincoln Stein <lstein@cshl.org>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.12"

RPM_NAME = "perl-IO-Socket-Multicast-1.12-19.39.aarch64.rpm"
RPM_HASH = "4ed180b026f518e316c42f5eb4d87c071ec28d4ac8e17eae1190ce386c1bb388131c1049e89bb7de1c22508e963e383adb1e9b5047eb19acb716d79a61085f89"

RPROVIDES:${PN} += "perl-IO--Socket--Multicast \
perl-IO-Socket-Multicast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-IO--Interface"

inherit rpm
