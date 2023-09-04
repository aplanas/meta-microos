SUMMARY = "Optimised list functions for doing index-related things"
DESCRIPTION = "Optimised list functions for doing index-related things. They're faster than \
common idioms in all cases, they avoid \
<https://ghc.haskell.org/trac/ghc/ticket/12620 space leaks>, and sometimes they \
fuse better as well."
LICENSE = "MPL-2.0"

PV = "0.4.0.1"

RPM_NAME = "ghc-ilist-0.4.0.1-2.1.aarch64.rpm"
RPM_HASH = "1c8e4ff5ce53c6b69c9cfc5dfa899ae60766a150b9aa0c188be2786e863db662558f699b994c4e6df9dbe8c5ae070444ccb5f96efbbe79425a094a6a8d826d29"

RPROVIDES:${PN} += "ghc-ilist \
libHSilist-0.4.0.1-9dvbAvSibn3BQOkPCJFvsJ-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
