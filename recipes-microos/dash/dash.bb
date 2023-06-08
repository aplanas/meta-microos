SUMMARY = "POSIX-compliant Implementation of /bin/sh"
DESCRIPTION = "DASH is a POSIX-compliant implementation of /bin/sh that aims to be as small as \
possible without sacrificing speed where possible."
LICENSE = "BSD-3-Clause"

PV = "0.5.12"

RPM_NAME = "dash-0.5.12-2.2.aarch64.rpm"
RPM_HASH = "6b780bbb30c6c55c344c666d422e5b571c77c3f75c6d6421856c44e5255fb5f9d87197fbd7db868a3f18cbe5a0f161a91143ce981e4e27020e8fe42f67f07322"

RPROVIDES:${PN} += "dash dash(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libedit.so.0()(64bit)"

inherit rpm
