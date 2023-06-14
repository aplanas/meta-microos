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

RPM_NAME = "python39-python-memcached-1.59-7.1.noarch.rpm"
RPM_HASH = "ad926bb1d78629096579a2d5b8ea2e75c4cad7bba1fdadf8afb946517b80da25ac173ccd48a5a00dafbcd7118c491b4d43786d1d4eff8d5b45fa455978a45b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-memcached \
python39-python-memcached \
python3dist-python-memcached"

RDEPENDS:${PN} += "memcached \
python-abi"

inherit rpm
