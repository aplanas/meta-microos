SUMMARY = "Haskell cryptonite library development files"
DESCRIPTION = "This package provides the Haskell cryptonite library development files."
LICENSE = "BSD-3-Clause"

PV = "0.30"

RPM_NAME = "ghc-cryptonite-devel-0.30-2.3.aarch64.rpm"
RPM_HASH = "a56d3eba64c286b502fc44cc44675bbffaf16a150bcb6ea27f26ff15a2a2c492e07edc59fef0134f747e43bea53b31b2150f9b9c48752ddf46909bdf499fca28"

RPROVIDES:${PN} += "ghc-cryptonite-devel \
ghc-cryptonite-devel(aarch-64) \
ghc-devel(cryptonite-0.30-AbDFzA14dNKDfU9pLpBLye)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-cryptonite \
ghc-devel(base-4.17.1.0) \
ghc-devel(basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(ghc-prim-0.9.0) \
ghc-devel(integer-gmp-1.1) \
ghc-devel(memory-0.18.0-2DG6nqjfLMK4MSR77XYQqL) \
glibc-devel"

inherit rpm
