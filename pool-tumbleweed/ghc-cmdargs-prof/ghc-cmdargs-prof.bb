SUMMARY = "Haskell cmdargs profiling library"
DESCRIPTION = "This package provides the Haskell cmdargs profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.10.22"

RPM_NAME = "ghc-cmdargs-prof-0.10.22-1.8.aarch64.rpm"
RPM_HASH = "3425571278d8c4c2ef004bd18c55090e02b562e526ee3a563fc3675c59fee9a6bc62435a5c5a5e8d9ef8bae2a5bc4671afbae32bcff9b45eb59373a3496e3102"

RPROVIDES:${PN} += "ghc-cmdargs-prof \
ghc-prof-cmdargs-0.10.22-J6270EPuJIGHu8u4tLBuYx"

RDEPENDS:${PN} += "ghc-cmdargs-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
