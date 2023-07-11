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

RPM_NAME = "perl-IO-Socket-Multicast-1.12-19.38.aarch64.rpm"
RPM_HASH = "edd7e2cece1d61ae063b13bf2c853a36197300b15792990c89bdd0112fb59997828e709d55c5c1d9f7fa11517800c06cbb41f5c48603c0aaab69a145e75d01cd"

RPROVIDES:${PN} += "perl-IO--Socket--Multicast \
perl-IO-Socket-Multicast"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1 \
perl-IO--Interface"

inherit rpm
