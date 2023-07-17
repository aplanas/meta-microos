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

RPM_NAME = "perl-Net-HTTP-6.23-1.1.noarch.rpm"
RPM_HASH = "e0aa457c2499b4f1691c317fdb6ba78ed68f632ca842e0622399d321dbc655dc4da5762ce7bc02ecfc14c0f5dadc6492adc518639066fffa095dae292a1a6af7"
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
