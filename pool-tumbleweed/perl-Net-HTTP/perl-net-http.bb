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

RPM_NAME = "perl-Net-HTTP-6.22-1.7.noarch.rpm"
RPM_HASH = "f0b9c9a48f3796496cc9bec5c0dc98ee291c28ada38cf3ee484499a4cfc0e5b259f1dbe0a1e39c44c6269f4465dcee4f2c86c0dbeb873d504cc958773fda9db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--HTTP \
perl-Net--HTTP--Methods \
perl-Net--HTTP--NB \
perl-Net--HTTPS \
perl-Net-HTTP"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Compress--Raw--Zlib \
perl-IO--Uncompress--Gunzip \
perl-URI"

inherit rpm
