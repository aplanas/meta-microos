SUMMARY = "Python 3 libraries for the RADOS block device"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rbd-16.2.13.66+g54799ee0666-3.1.aarch64.rpm"
RPM_HASH = "934dda7d7c41edb3fbf6f8c4a2c79aed4171f2023f7b40fc187ef62bf254e8308bb14e93d468655a82690bbddbe13941a570dc998073f6290366fae020db6267"

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
