SUMMARY = "Low-level HTTP connection (client)"
DESCRIPTION = "The 'Net::HTTP' class is a low-level HTTP client. An instance of the \
'Net::HTTP' class represents a connection to an HTTP server. The HTTP \
protocol is described in RFC 2616. The 'Net::HTTP' class supports \
'HTTP/1.0' and 'HTTP/1.1'. \
 \
'Net::HTTP' is a sub-class of one of 'IO::Socket::IP' (IPv6+IPv4), \
'IO::Socket::INET6' (IPv6+IPv4), or 'IO::Socket::INET' (IPv4 only). You can \
mix the methods described below with reading and writing from the socket \
directly. This is not necessary a good idea, unless you know what you are \
doing."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.22"

RPM_NAME = "perl-Net-HTTP-6.22-1.8.noarch.rpm"
RPM_HASH = "e8c89d24ba45f9fcfe68431011b73d01e8fecbc0be9d5f508003e05591c2ce4b1ae9288c3646b538830018392b2cc7d0322226201d7fd9d6a7fbd1d1ade41ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--HTTP \
perl-Net--HTTP--Methods \
perl-Net--HTTP--NB \
perl-Net--HTTPS \
perl-Net-HTTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Compress--Raw--Zlib \
perl-IO--Uncompress--Gunzip \
perl-URI"

inherit rpm
