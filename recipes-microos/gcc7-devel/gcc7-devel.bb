SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-devel-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "f67a426b1ed527248a032c82d08fb8993bdafe4163ed21255a3c1ffbc11803e0984e5d85982a5ad3e44ba9a1fc724b4882bdad981cbb6d601fa70e723cabe77f"

RPROVIDES:${PN} += "gcc7-devel gcc7-devel(aarch-64)"
RDEPENDS:${PN} += "gcc7 gmp-devel libc.so.6(GLIBC_2.34)(64bit) mpc-devel"

inherit rpm
