SUMMARY = "The eppic extension for crash"
DESCRIPTION = "EPPIC is a C interpreter that permits easy access to the symbol and type \
information stored in a executable image like a coredump or live memory \
interfaces (e.g. /dev/kmem, /dev/mem). Although it has a strong association \
with live or postmortem kernel analysis, it is not constraint to it and can be \
embedded in any tools that is C friendly. \
 \
This package provides the extension for the crash utility."
LICENSE = "GPL-2.0-or-later"

PV = "4.99.git.1682279748.c294e5b"

RPM_NAME = "crash-eppic-4.99.git.1682279748.c294e5b-1.1.aarch64.rpm"
RPM_HASH = "0d99b7f0c19b752eb89da0c16cce81bd8477e57b998b7c7b4b4ac9d6ee93e0ec17847b0180a295b0acf6cf5b4d7ed157e1bfa14092adaa21d43d0a85cac01d75"

RPROVIDES:${PN} += "crash-eppic \
crash-eppic(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
