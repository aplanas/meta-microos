SUMMARY = "User Space Tools for Kernel Auditing"
DESCRIPTION = "The audit package contains the user space utilities for storing and \
processing the audit records generated by the audit subsystem in the \
Linux kernel."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.9"

RPM_NAME = "audit-3.0.9-1.3.aarch64.rpm"
RPM_HASH = "62bdd5e597ee56dc6bf47cd5d0bce0c0543bc5b182a69b32ca80822addb4db3db874187fd104a2b1b81f2137d40f836af47196ebaf1fb56d75bc521cb4e4caa2"

RPROVIDES:${PN} += "audit \
config-audit"

RDEPENDS:${PN} += "/usr/bin/sh \
audit-libs \
coreutils \
group-audit \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libauparse.so.0 \
libc.so.6 \
libcap-ng.so.0 \
libwrap.so.0"

inherit rpm
