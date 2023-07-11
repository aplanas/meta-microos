SUMMARY = "Haskell bloomfilter profiling library"
DESCRIPTION = "This package provides the Haskell bloomfilter profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.0"

RPM_NAME = "ghc-bloomfilter-prof-2.0.1.0-6.6.aarch64.rpm"
RPM_HASH = "18fd515fba1a6e698427ca007fc08c8ff451bcff3b7cff22a5fc764c04cd0f6e45e75ecf8f63b1fcefdbb60cd3b9b2f553f74d448edd87f7e3184350d0adc5f1"

RPROVIDES:${PN} += "ghc-bloomfilter-prof \
ghc-prof-bloomfilter-2.0.1.0-3hF1ySDPbPQA7KQQeHgCqI"

RDEPENDS:${PN} += "ghc-bloomfilter-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
