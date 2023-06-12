SUMMARY = "Haskell silently profiling library"
DESCRIPTION = "This package provides the Haskell silently profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.5.3"

RPM_NAME = "ghc-silently-prof-1.2.5.3-2.2.aarch64.rpm"
RPM_HASH = "2c1894f6e4cf4ab6067ddff9586c4d6393462c67da1ed505bff149a8f4c2b0c3f159de7e67e4c5c0a1c426ab99dc0b81bd69abed3359f363e6ca28ac75c6af95"

RPROVIDES:${PN} += "ghc-prof(silently-1.2.5.3-HiTtkArMijI9DvRcUmgkYR) \
ghc-silently-prof \
ghc-silently-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-silently-devel"

inherit rpm
