SUMMARY = "Alex is a tool for generating lexical analysers in Haskell"
DESCRIPTION = "Alex is a tool for generating lexical analysers in Haskell. It takes a \
description of tokens based on regular expressions and generates a Haskell \
module containing code for scanning text efficiently. It is similar to the tool \
lex or flex for C/C++."
LICENSE = "BSD-3-Clause"

PV = "3.2.7.3"

RPM_NAME = "alex-3.2.7.3-1.2.aarch64.rpm"
RPM_HASH = "e0e6625cd5836c8587c4f657ac0fd0faabb873bc56f6d14a1980d4f2eb62302efe4b3e95b615b5145fde6294d27be6aace4fa4b75d4ebce8c4ecc138b64275ab"

RPROVIDES:${PN} += "alex alex(aarch-64)"
RDEPENDS:${PN} += "libatomic.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
