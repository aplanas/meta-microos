SUMMARY = "Client Library for Memcached (Memory Cache Daemon)"
DESCRIPTION = "This is the Perl API for memcached, a distributed memory cache daemon. More \
information is available at: \
 \
  http://www.danga.com/memcached/"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.30"

RPM_NAME = "perl-Cache-Memcached-1.30-1.21.noarch.rpm"
RPM_HASH = "e4add1946a8e11499b7b075d52dc3644df5e9f7f9b84378832d96108eeb9da2f21103cc41a02dda222dad2b7cea808b24d1c6743bfe3de53f62af62790968d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--Memcached \
perl-Cache--Memcached--GetParser \
perl-Cache-Memcached"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-String--CRC32"

inherit rpm
