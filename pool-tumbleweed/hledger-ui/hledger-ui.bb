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

RPM_NAME = "hledger-ui-1.28-2.5.aarch64.rpm"
RPM_HASH = "0f25b96643162632adb97bc7a3d298bd27548a6e58751710fdf6127dd338471babd092c0b56b6ac8bc538288b0ec5a15f29b6bd67ade9b64a8d59264cfadb287"

RPROVIDES:${PN} += "hledger-ui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
