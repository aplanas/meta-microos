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

RPM_NAME = "python310-python-memcached-1.59-7.3.noarch.rpm"
RPM_HASH = "b592c6b1cb3a0357bba34bb6523721aa783d2ca71cde227adad6f3c8482eb993b8be8a09c95325b3895baeaf670902b6842070907a15f0f20ab371e6fd80f3d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-memcached \
python310-python-memcached \
python3dist-python-memcached"

RDEPENDS:${PN} += "memcached \
python-abi"

inherit rpm
