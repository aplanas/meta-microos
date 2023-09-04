SUMMARY = "Haskell Only profiling library"
DESCRIPTION = "This package provides the Haskell Only profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-prof-0.1-6.1.aarch64.rpm"
RPM_HASH = "529bcbb92d19e9028b412db52c1848d67eaf470bf455419da8a0c1b08cb3fde4b4a57b6f5f1d0cf4faa3426f38be00252d7eb8937a202585000605644ad50153"

RPROVIDES:${PN} += "ghc-Only-prof \
ghc-prof-Only-0.1-qCrN026ulaL2ZFxnlcrV1"

RDEPENDS:${PN} += "ghc-Only-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
