SUMMARY = "Utility to list Xprint printers"
DESCRIPTION = "xplsprinters is a utility for Xprint, the printing system for the \
X Window system. It can deliver both a list of printers and \
attributes supported for a specific list of printers."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xplsprinters-1.0.1-9.27.aarch64.rpm"
RPM_HASH = "f0e1c088fa2e653dd735701df0cbd824210349f35e047b07d5f9d6e464bd9148e8f6aedbab58bb86fedeb6a287e14f1be8894ba5994513569e9989f669aef3de"

RPROVIDES:${PN} += "xplsprinters"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXp.so.6 \
libXprintUtil.so.1 \
libc.so.6"

inherit rpm
