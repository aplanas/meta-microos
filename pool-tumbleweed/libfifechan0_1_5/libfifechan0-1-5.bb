SUMMARY = "Main library of the Fifechan GUI toolkit"
DESCRIPTION = "Main shared library of fifechan."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan0_1_5-0.1.5-1.20.aarch64.rpm"
RPM_HASH = "d0dc6d714ab0aa97773b3f6bd7c3583b5a04acaa900506c52edf4b46cd7edfff01fff86d6f5131e911194698b1f588623d8be124648a0aae740dfce750c4e596"

RPROVIDES:${PN} += "libfifechan.so.0.1.5 \
libfifechan0-1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
