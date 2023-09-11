SUMMARY = "Haskell blaze-builder profiling library"
DESCRIPTION = "This package provides the Haskell blaze-builder profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.2.3"

RPM_NAME = "ghc-blaze-builder-prof-0.4.2.3-1.1.aarch64.rpm"
RPM_HASH = "4a12a832a9ecda38d045c68c9ded54cd6c56141b967ece5e23b4e36e9eef7a788a0ec091f4ed01b66aa6a880f62934a359b079a7270d22360dd4406faa753f62"

RPROVIDES:${PN} += "ghc-blaze-builder-prof \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND"

RDEPENDS:${PN} += "ghc-blaze-builder-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-text-2.0.2"

inherit rpm
