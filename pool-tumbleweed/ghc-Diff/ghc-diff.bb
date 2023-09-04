SUMMARY = "O(ND) diff algorithm in haskell"
DESCRIPTION = "Implementation of the standard diff algorithm, and utilities for pretty \
printing."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-0.4.1-2.8.aarch64.rpm"
RPM_HASH = "88d124bdf6902bb328fcb0dbc8e9be248a0ead4dd0615108cd9d4fddb41ea100637e8ac99197750ce72cdc5960a9340dca3d5493299aec1593525ddc02471556"

RPROVIDES:${PN} += "ghc-Diff \
libHSDiff-0.4.1-LhFtxwvuVVqGkTz0Ph6iJg-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
