SUMMARY = "Command line tools for the Enchant spell checking library"
DESCRIPTION = "A library providing an efficient extensible abstraction for dealing \
with different spell checking libraries. \
 \
This package provides command-line tools to interact with enchant."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-tools-2.2.15-3.3.aarch64.rpm"
RPM_HASH = "735d484e9321835841a7c3eae129dd4c48e335a3f286e7bb7cec23057fd4034a63fc2efc1bc6648ecc1c28f12df6dc2db08fe8d7c15506f7a15965772c6919bd"

RPROVIDES:${PN} += "enchant-tools enchant-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libenchant-2.so.2()(64bit) libglib-2.0.so.0()(64bit)"

inherit rpm
