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

PV = "6.23"

RPM_NAME = "perl-Net-HTTP-6.23-1.2.noarch.rpm"
RPM_HASH = "7f3dccb22f76ef6afb1b900f0851d99cd9e9f6cf7b7ae278fbe2154608687ca13107ca52e50755024595fccdd7b2f457a3bcc1aab77df64bdd683b8cfddd7041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--HTTP \
perl-Net--HTTP--Methods \
perl-Net--HTTP--NB \
perl-Net--HTTPS \
perl-Net-HTTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Compress--Raw--Zlib \
perl-IO--Uncompress--Gunzip \
perl-URI"

inherit rpm
