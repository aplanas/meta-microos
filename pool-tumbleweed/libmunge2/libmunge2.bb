SUMMARY = "Libraries for applications using MUNGE"
DESCRIPTION = "A shared library for applications using the MUNGE authentication service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.15"

RPM_NAME = "libmunge2-0.5.15-2.5.aarch64.rpm"
RPM_HASH = "b59fd002b0bab25a75b55d2e5d5a107bad8ac08d0eaa9dcfc688618cc385a00a89479f1f987e2a0818af3cc303d621a7f6cc1aca19682f5f28769bb19666aeb8"

RPROVIDES:${PN} += "libmunge.so.2 \
libmunge2 \
munge-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
