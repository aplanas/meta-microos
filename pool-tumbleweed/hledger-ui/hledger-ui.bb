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

RPM_NAME = "hledger-ui-1.28-2.7.aarch64.rpm"
RPM_HASH = "fc46f9d49f41c71e164d547d40d7028e7272a3b8e821e0ea61dd0a409497a383a82f1f625f0d1e77497d0d4fe6854371c2444079411bcbbe3ed0162f6b959368"

RPROVIDES:${PN} += "hledger-ui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
