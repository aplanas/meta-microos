SUMMARY = "Haskell containers profiling library"
DESCRIPTION = "This package provides the Haskell containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-prof-0.6.7-3.2.aarch64.rpm"
RPM_HASH = "f4dea813a0811c75cc9c4442dd1f50aa597aac05535318c0ee5e11c87f677d4e46bdbc660d387c7d0ef3698314d599918fa072c49fd85d6626c465127d28ef38"

RPROVIDES:${PN} += "ghc-containers-prof \
ghc-prof-containers-0.6.7"

RDEPENDS:${PN} += "ghc-containers-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
