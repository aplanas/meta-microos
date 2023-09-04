SUMMARY = "Python 3 libraries for the RADOS gateway"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
gateway."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rgw-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "2352ad2182d6cea486ba97354ebe23dbe3685b01847f81d4afdbf463fb05cb658833d4cb38e873805968e95575572c341a3e7059889ef8f09af9f7e61e02d751"

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
