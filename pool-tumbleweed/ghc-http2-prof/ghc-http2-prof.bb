SUMMARY = "Haskell http2 profiling library"
DESCRIPTION = "This package provides the Haskell http2 profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-prof-3.0.3-2.14.aarch64.rpm"
RPM_HASH = "e2ea94e29bc78e6afe962013295d1c36b491962268f2056bbf2d8b56922a80cab2c1a6bf506e8d65ec3daaf1a42aa463e9963b23671839597b7af943e4a7beda"

RPROVIDES:${PN} += "ghc-http2-prof \
ghc-prof-http2-3.0.3-41eYSHbDrcoAjUXjlws3pm"

RDEPENDS:${PN} += "ghc-http2-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-prof-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-prof-network-byte-order-0.1.6-vRMRsceTnFFPQXnTdvJFs \
ghc-prof-psqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C \
ghc-prof-stm-2.5.1.0 \
ghc-prof-time-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS \
ghc-prof-unix-time-0.4.10-fuTENic3zHIuWAM5F0fYB"

inherit rpm
