SUMMARY = "FreeIPMI library"
DESCRIPTION = "This project provides 'Remote-Console' (out-of-band) and \
'System Management Software' (in-band) based on Intelligent \
Platform Management Interface specification. \
 \
This package contains the libfreeipmi library."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "libfreeipmi17-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "c4075c6f296bbde8842234c784766d4d46c1b9c977bdfd37073b5bfa20a03a86a7cdaf21f2a5c14e3bfa2c0e0b944b077277eed225e4bbc5a620e79558eec11e"

RPROVIDES:${PN} += "libfreeipmi.so.17 \
libfreeipmi17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libm.so.6"

inherit rpm
