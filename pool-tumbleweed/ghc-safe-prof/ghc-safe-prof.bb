SUMMARY = "Haskell safe profiling library"
DESCRIPTION = "This package provides the Haskell safe profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.19"

RPM_NAME = "ghc-safe-prof-0.3.19-4.6.aarch64.rpm"
RPM_HASH = "6b09915db9db4b3319bed902aa2263f252e6b9f392d2cd8d5d46d314ec7ad03159274fd857c022cfb2e51d20cb027585cbc9c33410f81ccb446cf72ee25d6bcb"

RPROVIDES:${PN} += "ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-safe-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-safe-devel"

inherit rpm
