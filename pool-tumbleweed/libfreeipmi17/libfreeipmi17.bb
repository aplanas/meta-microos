SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libfreeipmi library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.11"

RPM_NAME = "libfreeipmi17-1.6.11-1.1.aarch64.rpm"
RPM_HASH = "9ffdfbc8665aaa3e9501e06f99db6b20eb92bab4256030e319d58350319127500785b1cbaeb752f4d4fc687709d4e512cfe7171c080f7596723bf34637ae413e"

RPROVIDES:${PN} += "libfreeipmi.so.17 \
libfreeipmi17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libm.so.6"

inherit rpm
