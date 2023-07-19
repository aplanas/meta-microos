SUMMARY = "Library for interfacing with the kernel audit subsystem"
DESCRIPTION = "The libaudit package contains the shared libraries needed for \
applications to use the audit framework."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.1"

RPM_NAME = "libaudit1-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "acae50e61679b2f0cf2f99147af29274a2a6a61b40b46af5515c7bad60648a30985582fc07a9240a9e2e69a0b3b3ffb780480821b2657e46ba7046202604bfc1"

RPROVIDES:${PN} += "audit-libs \
config-libaudit1 \
libaudit.so.1 \
libaudit1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
