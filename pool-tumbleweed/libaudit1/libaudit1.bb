SUMMARY = "Library for interfacing with the kernel audit subsystem"
DESCRIPTION = "The libaudit package contains the shared libraries needed for \
applications to use the audit framework."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "libaudit1-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "5de54a9ebe983b3ccbf7ea961148fac7a3a24b33148be7137ac0c0beddd1f01dfde037dd3d2e1077eaa994afc6b0f8a14ed104f0322be78df9a81c4cd47cf1d1"

RPROVIDES:${PN} += "audit-libs \
config-libaudit1 \
libaudit.so.1 \
libaudit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
