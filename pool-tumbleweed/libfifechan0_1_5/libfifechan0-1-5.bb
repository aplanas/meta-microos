SUMMARY = "Main library of the Fifechan GUI toolkit"
DESCRIPTION = "Main shared library of fifechan."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan0_1_5-0.1.5-1.19.aarch64.rpm"
RPM_HASH = "0397933eca4c1a9d0dd542c7189422fe553d21b29a3ec8a8cff7cb1bad7e1d85d46b42b129c213b97be644a734a1f78f1c66ec2e3e536e01a503d78e9dfb46c4"

RPROVIDES:${PN} += "libfifechan.so.0.1.5()(64bit) \
libfifechan0_1_5 \
libfifechan0_1_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
