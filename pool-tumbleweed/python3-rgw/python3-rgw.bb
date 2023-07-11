SUMMARY = "Python 3 libraries for the RADOS gateway"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
gateway."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rgw-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "6ca76f67e0902fdfccbe1c85899c332401a40e98d3faa14185d8e31d6580db48f3e295e24f5f5d0d6c5645d93710d93da218be86e2facf3721f9ad427ad04404"

RPROVIDES:${PN} += "python-rgw \
python3-rgw \
python3.11dist-rgw \
python3dist-rgw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librgw.so.2 \
librgw2 \
python-abi \
python3-rados"

inherit rpm
