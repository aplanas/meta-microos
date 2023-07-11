SUMMARY = "User-Specific Process Accounting"
DESCRIPTION = "This package contains the programs necessary for user-specific process \
accounting: sa, accton, and lastcomm."
LICENSE = "GPL-2.0-or-later"

PV = "6.6.4"

RPM_NAME = "acct-6.6.4-4.8.aarch64.rpm"
RPM_HASH = "471b4b6009f7842bb6bec895d1499533881b7ae038c1edc6a0546a34d95d7ae3c0d84891d15275e10f66de6072e80bcf4d8b9f2c3f496409bd3d9c89643f1f26"

RPROVIDES:${PN} += "acct \
config-acct"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
logrotate"

inherit rpm
