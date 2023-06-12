SUMMARY = "Haskell tar profiling library"
DESCRIPTION = "This package provides the Haskell tar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-prof-0.5.1.1-11.3.aarch64.rpm"
RPM_HASH = "66def11282bc8e98f4152a8bbda6ca5558fa76cc08e84550c86c50aea7af2f968545ae6bd996e658f7ce558a8f7e4b7c5996940782b9ada9a5f5d60699beb518"

RPROVIDES:${PN} += "ghc-prof(tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8) \
ghc-tar-prof \
ghc-tar-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(time-1.12.2) \
ghc-tar-devel"

inherit rpm
