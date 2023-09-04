SUMMARY = "Python 3 libraries for the RADOS block device"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rbd-16.2.13.66+g54799ee0666-4.1.aarch64.rpm"
RPM_HASH = "77275cb89d473b9b0ffdbda04a061af2ed6843bf9738d0eb1a4be116368641fddb27d56d8305a9a395dee60a758459876b0de834f5c19c32588d344b6c5267ab"

RPROVIDES:${PN} += "python-rbd \
python3-rbd \
python3.11dist-rbd \
python3dist-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librbd.so.1 \
librbd1 \
python-abi \
python3-rados"

inherit rpm
