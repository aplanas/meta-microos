SUMMARY = "Command-line interface for the hledger accounting system"
DESCRIPTION = "The command-line interface for the hledger accounting system. Its basic \
function is to read a plain text file describing financial transactions and \
produce useful reports. \
 \
hledger is a robust, cross-platform set of tools for tracking money, time, or \
any other commodity, using double-entry accounting and a simple, editable file \
format, with command-line, terminal and web interfaces. It is a Haskell rewrite \
of Ledger, and one of the leading implementations of Plain Text Accounting. \
Read more at: <https://hledger.org>."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "hledger-1.28-2.8.aarch64.rpm"
RPM_HASH = "4bb93cfc72063b2780a20156b0a78d97817227daf287506f0c6a11e3d4447980927a710ed911c6a90cb5e86d1d99179160aa87b11ad7f22492ca16930e22f7b7"

RPROVIDES:${PN} += "hledger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
