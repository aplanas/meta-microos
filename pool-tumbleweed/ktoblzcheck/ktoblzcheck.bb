SUMMARY = "A library to check account numbers and bank codes of German banks"
DESCRIPTION = "KtoBLZCheck is a library to check account numbers and bank codes \
of German banks. Both a library for other programs as well as a \
short command-line tool is available. It is possible to check \
pairs of account numbers and bank codes (BLZ) of German banks, \
and to map bank codes (BLZ) to the clear-text name and location \
of the bank."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "ktoblzcheck-1.53-1.5.aarch64.rpm"
RPM_HASH = "342228f130a2a9112e1224e790fa31a8af5052a15d97fc1087ac134a74a86d9d5e2a035e76b3886298a8f7225db558017e22dd3ba68cd5296e6daa8789b82fd6"

RPROVIDES:${PN} += "ktoblzcheck"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libktoblzcheck.so.1 \
libstdc++.so.6"

inherit rpm
