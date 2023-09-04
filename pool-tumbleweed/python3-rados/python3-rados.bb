SUMMARY = "Python 3 libraries for the RADOS object store"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rados-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "7e5ddb62570f5380a95a4428e861c5362057dbe629a330ac16d9b8fd0da84e5ba512078a81ff24d71961644299235bbfd35e342f3797d30040aae9d092d1b24a"

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
