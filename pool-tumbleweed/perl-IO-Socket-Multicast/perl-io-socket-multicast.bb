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

RPM_NAME = "perl-IO-Socket-Multicast-1.12-19.37.aarch64.rpm"
RPM_HASH = "2854edda8b49a303e7c8378ad47baee252bad17f57c5ab993730e1130f8d35db39d12ec0eba9d0f95d7980f70c82c08736bfb980382f41b698884c77638d3cbf"

RPROVIDES:${PN} += "perl-IO--Socket--Multicast \
perl-IO-Socket-Multicast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.0 \
perl-IO--Interface"

inherit rpm
