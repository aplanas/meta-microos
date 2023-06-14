SUMMARY = "Curses-style terminal interface for the hledger accounting system"
DESCRIPTION = "A simple curses-style terminal user interface for the hledger accounting \
system. It can be a more convenient way to browse your accounts than the CLI. \
This package currently does not support Microsoft Windows, except in WSL. \
 \
hledger is a robust, cross-platform set of tools for tracking money, time, or \
any other commodity, using double-entry accounting and a simple, editable file \
format, with command-line, terminal and web interfaces. It is a Haskell rewrite \
of Ledger, and one of the leading implementations of Plain Text Accounting. \
Read more at: <https://hledger.org>."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "hledger-ui-1.28-2.2.aarch64.rpm"
RPM_HASH = "b3efdd248d9401a86c8dbab32194b477ca03aac877156c0d0fbd974a26ca228146dd6a7798f746ffe4835376656d3ad0c2f3b7c32f25527321f2a8fddd72ce33"

RPROVIDES:${PN} += "hledger-ui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatomic.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
