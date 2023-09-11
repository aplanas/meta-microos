SUMMARY = "Haskell blaze-markup profiling library"
DESCRIPTION = "This package provides the Haskell blaze-markup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-prof-0.8.2.8-6.4.aarch64.rpm"
RPM_HASH = "0b02ec26e17c9138054c32562da53c0cb16bfcbbdc116d3bacc2718f04a76adf945ba5aae8a10809450ceaacce8dd9e809ed216ade4ffd06a3c14b13d8040529"

RPROVIDES:${PN} += "ghc-blaze-markup-prof \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP"

RDEPENDS:${PN} += "ghc-blaze-markup-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-text-2.0.2"

inherit rpm
