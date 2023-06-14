SUMMARY = "Python 3 libraries for the RADOS object store"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rados-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "d8af721d828a1ba9adb1ca7f88446c79171bba622a3488fa47aa8d034a4d38cfe0637732208430dcd4676faf221bb6528f7f6c442b02f470380899342e45193c"

RPROVIDES:${PN} += "python-rados \
python3-rados \
python3.10dist-rados \
python3dist-rados"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librados2 \
python-abi \
python3"

inherit rpm
