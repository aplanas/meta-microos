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

RPM_NAME = "hledger-1.28-3.2.aarch64.rpm"
RPM_HASH = "ac3619c65f78ca1e6d7ba26415fd13eb5aff42f370a36c023384a830ddd48a4a4f0605f48130b032ea2589ca839dcfdec253f779f3163d09d6687baee09a3dbf"

RPROVIDES:${PN} += "hledger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
