SUMMARY = "Client Library for Memcached (Memory Cache Daemon)"
DESCRIPTION = "This is the Perl API for memcached, a distributed memory cache daemon. More \
information is available at: \
 \
  http://www.danga.com/memcached/"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.30"

RPM_NAME = "perl-Cache-Memcached-1.30-1.22.noarch.rpm"
RPM_HASH = "d9c19055a6a757dd31da94bc81372a370ca98bad4cd9f76990a6d5fd907f5fe12c09dec76e1ae769b82b3abf30181087976c98240374df3c0d710e772fceb63b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--Memcached \
perl-Cache--Memcached--GetParser \
perl-Cache-Memcached"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-String--CRC32"

inherit rpm
