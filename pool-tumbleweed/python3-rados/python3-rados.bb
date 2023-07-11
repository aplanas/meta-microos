SUMMARY = "Python 3 libraries for the RADOS object store"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rados-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "dee670e58b8351f3cebddaac42864bdb3ae555685d5fc90cd3d3213e13d43545f08d7e46578926a9d894c522ecbda1a66eb87aa26d0b6e5ab7f4234bea833356"

RPROVIDES:${PN} += "python-rados \
python3-rados \
python3.11dist-rados \
python3dist-rados"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librados2 \
python-abi \
python3"

inherit rpm
