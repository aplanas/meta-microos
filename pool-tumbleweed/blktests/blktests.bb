SUMMARY = "Linux kernel block layer testing framework"
DESCRIPTION = "blktests is a test framework for the Linux kernel block layer and \
storage stack. It is inspired by the xfstests filesystem testing \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "0+20230615.154e652"

RPM_NAME = "blktests-0+20230615.154e652-1.1.aarch64.rpm"
RPM_HASH = "130f995eb81de3a537af68a310a86b988c5ac55250b3344493bd97c5aa483f7f50374b16e9d6f8f5b4a847ee2c330393a2ec190b040142fde0d51d39eeb771e3"

RPROVIDES:${PN} += "blktests"

RDEPENDS:${PN} += "/usr/bin/bash \
fio \
gawk \
gcc \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
make"

inherit rpm
