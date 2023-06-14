SUMMARY = "The header files for the lockdev library"
DESCRIPTION = "Lockdev provides a reliable way to put an exclusive lock to devices \
using both FSSTND and SVr4 methods."
LICENSE = "LGPL-2.0-only"

PV = "1.0.3_git201003141408"

RPM_NAME = "liblockdev1-1.0.3_git201003141408-31.20.aarch64.rpm"
RPM_HASH = "5eb1a6e81a517a4135318e085bc933a74f1ad431cb6ae1c992aaaeba52786c573fda26fbfc3fa89830f19fd3b3ddda95fd36265e8570b0e62f1e58ef0cfdeba2"

RPROVIDES:${PN} += "liblockdev.so.1 \
liblockdev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/sbin/lockdev \
glibc \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
