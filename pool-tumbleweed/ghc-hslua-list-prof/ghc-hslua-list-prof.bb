SUMMARY = "Haskell hslua-list profiling library"
DESCRIPTION = "This package provides the Haskell hslua-list profiling library."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-hslua-list-prof-1.1.1-2.5.aarch64.rpm"
RPM_HASH = "d525f24c4adacd480bcbbef60def10f5f920d8b0f78882cbb740f8e89ee685854dcea7c6efc282e4410d3c19462363ce0502236f75ee4d0f48babca788430a9a"

RPROVIDES:${PN} += "ghc-hslua-list-prof \
ghc-prof-hslua-list-1.1.1-2YSx4pSaGRhHpPDWFYeDXu"

RDEPENDS:${PN} += "ghc-hslua-list-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk"

inherit rpm
