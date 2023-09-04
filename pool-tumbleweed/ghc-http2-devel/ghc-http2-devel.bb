SUMMARY = "Haskell http2 library development files"
DESCRIPTION = "This package provides the Haskell http2 library development files."
LICENSE = "BSD-3-Clause"

PV = "3.0.3"

RPM_NAME = "ghc-http2-devel-3.0.3-2.14.aarch64.rpm"
RPM_HASH = "ab4c537ef2ff78b1cb121fc7ab81849de04b3189cacd9c3a28f705c667ed8683b678078e229cf96e12b0b7c8f1d1d6c2de32675d592a72e47d954375f8ece9d4"

RPROVIDES:${PN} += "ghc-devel-http2-3.0.3-41eYSHbDrcoAjUXjlws3pm \
ghc-http2-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-async-2.2.4-LcXCzTmy8C6G7Wa774EctI \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-http-types-0.12.3-FlcnRjG0fwC5p06cSFRT1p \
ghc-devel-network-3.1.4.0-5p1NVWLTlrvDdAAI1mskSs \
ghc-devel-network-byte-order-0.1.6-vRMRsceTnFFPQXnTdvJFs \
ghc-devel-psqueues-0.2.7.3-HjZq7FmM1u5AN66Kt7is6C \
ghc-devel-stm-2.5.1.0 \
ghc-devel-time-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS \
ghc-devel-unix-time-0.4.10-fuTENic3zHIuWAM5F0fYB \
ghc-http2"

inherit rpm
