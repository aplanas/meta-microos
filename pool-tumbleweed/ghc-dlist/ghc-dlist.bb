SUMMARY = "Difference lists"
DESCRIPTION = "List-like types supporting O(1) append and snoc operations."
LICENSE = "BSD-3-Clause"

PV = "1.0"

RPM_NAME = "ghc-dlist-1.0-3.2.aarch64.rpm"
RPM_HASH = "26f9f53edf6c4493090178d16c51a8d7eccfe74bef5a6fab64b3407758b4a06ee42495c34143824107f330abf45fe4d444ad34034f175b067ac15dc2774bb56c"

RPROVIDES:${PN} += "ghc-dlist \
ghc-dlist(aarch-64) \
libHSdlist-1.0-BmTLN13CmmLQvuHz7BjP9-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
