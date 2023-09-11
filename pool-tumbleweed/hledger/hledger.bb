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

RPM_NAME = "hledger-1.28-3.9.aarch64.rpm"
RPM_HASH = "91ed7d9ad424ffc380b5fd19870bf7fd81e4d0b7ffd885e149826057fcc94dd1ec39fbac287549f80f11798cf8033943b4ad6b1288a23db475e066d74ff8a6f9"

RPROVIDES:${PN} += "hledger"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1 \
libtinfo.so.6"

inherit rpm
