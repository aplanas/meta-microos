SUMMARY = "Haskell tagsoup profiling library"
DESCRIPTION = "This package provides the Haskell tagsoup profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-prof-0.14.8-6.8.aarch64.rpm"
RPM_HASH = "cb25c374667913b82699ef0db940704c1e0bede0228788bc2db729962d873511709bf0c78d849958882fb33a3fbcab2e70c90d71ee13d4db0dce75a37db7a744"

RPROVIDES:${PN} += "ghc-prof-tagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn \
ghc-tagsoup-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-text-2.0.2 \
ghc-tagsoup-devel"

inherit rpm
