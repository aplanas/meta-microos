SUMMARY = "UUID module for Qore"
DESCRIPTION = "This package contains the uuid module for the Qore Programming Language. \
 \
UUIDs are universally unique identifiers that can be used for any purpose."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-uuid-module-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "b21fe46ef25a1b796a1897a719b3d35a4ebd5dfb43c37843aa533c9ec5e2e8d5f5bca98e4a289a2971db06439f580ae67986378edadaddab911f030f05031912"

RPROVIDES:${PN} += "qore-uuid-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libuuid.so.1 \
qore-module-abi"

inherit rpm
