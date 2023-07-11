SUMMARY = "The header files for the lockdev library"
DESCRIPTION = "Lockdev provides a reliable way to put an exclusive lock to devices \
using both FSSTND and SVr4 methods."
LICENSE = "LGPL-2.0-only"

PV = "1.0.3_git201003141408"

RPM_NAME = "liblockdev1-1.0.3_git201003141408-32.1.aarch64.rpm"
RPM_HASH = "e652b327fcbec9eee1f469ee4c18f432f7789ab593b97af4934ba2908542b35063fab870f77e0da1470b9c54468deafdc89a57bc35d4cc4917f53e9a4f6a10f4"

RPROVIDES:${PN} += "liblockdev.so.1 \
liblockdev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/sbin/lockdev \
glibc \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
