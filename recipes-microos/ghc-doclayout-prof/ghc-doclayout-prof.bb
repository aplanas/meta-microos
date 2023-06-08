SUMMARY = "Haskell doclayout profiling library"
DESCRIPTION = "This package provides the Haskell doclayout profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-doclayout-prof-0.4.0.1-1.2.aarch64.rpm"
RPM_HASH = "468fa60ce195b4cb94dfebbee2c6627e966ca268052e607b4220ac77fe8d0736fa114492dffb286d97cb104c2edf49c52f5af9f126c821b5e17b0743569c0499"

RPROVIDES:${PN} += "ghc-doclayout-prof ghc-doclayout-prof(aarch-64) ghc-prof(doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0)"
RDEPENDS:${PN} += "ghc-doclayout-devel ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(emojis-0.1.2-Gz9J6Rv977iEZp4TYp7wAm) ghc-prof(mtl-2.2.2) ghc-prof(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) ghc-prof(text-2.0.2)"

inherit rpm
