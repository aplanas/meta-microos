SUMMARY = "Haskell bloomfilter profiling library"
DESCRIPTION = "This package provides the Haskell bloomfilter profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.2"

RPM_NAME = "ghc-bloomfilter-prof-2.0.1.2-1.2.aarch64.rpm"
RPM_HASH = "6c901ccf1b77303191727d038630558eef4f377132d34a1894cff73685d85d8aba2172cd492cec6f41b98f4e4e6c4622a819916b7f72420cb0e992ec51d59ba3"

RPROVIDES:${PN} += "ghc-bloomfilter-prof \
ghc-prof-bloomfilter-2.0.1.2-189xqL1vwBgClUIFXZGPWh"

RDEPENDS:${PN} += "ghc-bloomfilter-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-deepseq-1.4.8.0"

inherit rpm
