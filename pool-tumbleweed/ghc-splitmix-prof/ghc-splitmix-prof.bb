SUMMARY = "Haskell splitmix profiling library"
DESCRIPTION = "This package provides the Haskell splitmix profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.4"

RPM_NAME = "ghc-splitmix-prof-0.1.0.4-4.8.aarch64.rpm"
RPM_HASH = "f1a7052fc061b180fa334ea253e3bfe09300140164716c83a035d5e42feabfac4cbee860aed1f911813f7cb73b812047b07ccce1c5fa0ca05db7bcfd5572ba16"

RPROVIDES:${PN} += "ghc-prof-splitmix-0.1.0.4-2jzLu9hw0mWH5mdbN14y0O \
ghc-splitmix-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-splitmix-devel"

inherit rpm
