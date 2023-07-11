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

RPM_NAME = "python311-python-memcached-1.59-7.3.noarch.rpm"
RPM_HASH = "c71eba509457c80a2ecd6f0e6dbeebd63cfbdb76edb285307b732e3684055360eefb18971a6fbc5ad5710e9203f89c557b962d0d77f6f500f831c7b48930fec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-memcached \
python3.11dist-python-memcached \
python311-python-memcached \
python3dist-python-memcached"

RDEPENDS:${PN} += "memcached \
python-abi"

inherit rpm
