SUMMARY = "Linenoise module for Qore"
DESCRIPTION = "The linenoise module provides readline-like functionality to Qore, \
allowing qore programs to manage comfortable user input in the command line."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.0.1"

RPM_NAME = "qore-linenoise-module-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "5692c48d0a4f7e186ded08a273f58019174ae332f9b15aa3f3adcf31f2b646dcb5255bf0a4a1568840d963791e4b2e0c105f6d50a9950ce6ca353866046dfaab"

RPROVIDES:${PN} += "qore-linenoise-module \
qore-linenoise-module(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
