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

RPM_NAME = "crash-eppic-4.99.git.1682279748.c294e5b-1.2.aarch64.rpm"
RPM_HASH = "2f979587460b95986a9219dc5f211eb833d6d955c80ecad17df4340bde1de886e62c90b0a7f92b4531472548d14800ec013c9f9e6e56d5cd06777afc3cfc8364"

RPROVIDES:${PN} += "crash-eppic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
