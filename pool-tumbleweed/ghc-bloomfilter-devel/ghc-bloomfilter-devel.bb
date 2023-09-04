SUMMARY = "Haskell bloomfilter library development files"
DESCRIPTION = "This package provides the Haskell bloomfilter library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.2"

RPM_NAME = "ghc-bloomfilter-devel-2.0.1.2-1.2.aarch64.rpm"
RPM_HASH = "b2908f3862059cd8bebec832e678af9fb34cfed68fcf0459bcf8dc2e81b455f8d627b14fb22dc02437f7843826c212f0e6f66d76bf54e65a607828fa94b29c4e"

RPROVIDES:${PN} += "ghc-bloomfilter-devel \
ghc-devel-bloomfilter-2.0.1.2-189xqL1vwBgClUIFXZGPWh"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-bloomfilter \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
