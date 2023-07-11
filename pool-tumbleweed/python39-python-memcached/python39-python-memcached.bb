SUMMARY = "Pure python memcached client"
DESCRIPTION = "This package was originally written by Evan Martin of Danga. \
Sean Reifschneider of tummy.com, ltd. has taken over maintenance of it. \
 \
This software is a 100% Python interface to the memcached memory cache \
daemon.  It is the client side software which allows storing values in one \
or more, possibly remote, memcached servers.  Search google for memcached \
for more information."
LICENSE = "Python-2.0"

PV = "1.59"

RPM_NAME = "python39-python-memcached-1.59-7.3.noarch.rpm"
RPM_HASH = "eb5985d1d22cfe77db7eab4008e20f3e535619672d56feff0b7c443acb593c097ee2a176a9f264ce64139a51e5346e5bafe9d23ef28b93fadba6f40d58cfe41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-memcached \
python39-python-memcached \
python3dist-python-memcached"

RDEPENDS:${PN} += "memcached \
python-abi"

inherit rpm
