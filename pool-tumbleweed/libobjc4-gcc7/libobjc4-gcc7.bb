SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libobjc4-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "d690dd4d27bcdaa91d24d6a229ced1338f2937fd2420708a8cb7760658c838e8634e7a851163feab2c0dcdbcc4a5a1cb56cf2272f5fb298fccf65881e8926068"

RPROVIDES:${PN} += "libobjc.so.4 \
libobjc4 \
libobjc4-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
