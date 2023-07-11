SUMMARY = "A library for locking devices"
DESCRIPTION = "Lockdev provides a reliable way to put an exclusive lock to devices \
using both FSSTND and SVr4 methods."
LICENSE = "LGPL-2.0-only"

PV = "1.0.3_git201003141408"

RPM_NAME = "lockdev-1.0.3_git201003141408-32.1.aarch64.rpm"
RPM_HASH = "22f3a0d7948baa54562c365712172d567423358f663980da4a01d591b0da67966b0013d4e0f6a97c9d9f5a19a0aa36ee16c6d1ddc28178ad62164a8433d34d87"

RPROVIDES:${PN} += "lockdev"

RDEPENDS:${PN} += "/usr/bin/sh \
group-lock \
libc.so.6 \
liblockdev.so.1 \
permissions"

inherit rpm
