SUMMARY = "Python bindings for RRDtool"
DESCRIPTION = "Python RRDtool bindings."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "python3-rrdtool-1.8.0-3.4.aarch64.rpm"
RPM_HASH = "d5b07178f6b0305f0c9d262b83c953828ae3f5ec2085325adcea3320062de509f06b086ec94b18dcb5857882e78603cc2f09d38b3220d7c953437cf5e02e5026"

RPROVIDES:${PN} += "python3-rrdtool \
python3.11dist-rrdtool \
python3dist-rrdtool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
python-abi \
python3 \
rrdtool"

inherit rpm
