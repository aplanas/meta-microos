SUMMARY = "Advanced Linux Sound Architecture Library"
DESCRIPTION = "This package contains the library for ALSA, Advanced Linux Sound \
Architecture."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.9"

RPM_NAME = "libasound2-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "5f1854f129f385d15384b50a655b2c474d6eceba5b57dc7a9a9298d89181acae5d4f95b317141d3fc6d2a8fed886047ee0e719500a5f5a2898ec984dfa200c7c"

RPROVIDES:${PN} += "alsa-lib \
libasound.so.2 \
libasound2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
