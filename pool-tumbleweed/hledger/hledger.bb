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

RPM_NAME = "hledger-1.28-3.1.aarch64.rpm"
RPM_HASH = "3851cd2c0634e900cdd9279e0b340f6d61bbf37a7af860509c74e276b1b332fd2bd03ba110e63457f48dad4d509c0504c962241a603ae7f45733d9edb6a24b2c"

RPROVIDES:${PN} += "hledger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
