SUMMARY = "A library for locking devices"
DESCRIPTION = "Lockdev provides a reliable way to put an exclusive lock to devices \
using both FSSTND and SVr4 methods."
LICENSE = "LGPL-2.0-only"

PV = "1.0.3_git201003141408"

RPM_NAME = "lockdev-1.0.3_git201003141408-31.20.aarch64.rpm"
RPM_HASH = "f593710d7d9dead764c33c9670af8ce6ba1c02b4d479900c8aafac7e90199d7b63e1dffe904bd0c324a458ae620d0b7819d2ba6ea952b27274674b5873fc3674"

RPROVIDES:${PN} += "lockdev"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblockdev.so.1 \
permissions \
pwdutils"

inherit rpm
