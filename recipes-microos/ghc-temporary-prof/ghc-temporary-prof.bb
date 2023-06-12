SUMMARY = "Haskell temporary profiling library"
DESCRIPTION = "This package provides the Haskell temporary profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-temporary-prof-1.3-6.2.aarch64.rpm"
RPM_HASH = "66cd466abbe62cd7c6e02d94b73dda99d2bb48a7b8f4a6f3c4ac0aab9afe2df7a30be46b27839b67e64410729e8f549389bf91cbc3b998e1128bef7e42c90f49"

RPROVIDES:${PN} += "ghc-prof(temporary-1.3-9rLWZg49Shk3gKExST32p) \
ghc-temporary-prof \
ghc-temporary-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unix-2.7.3) \
ghc-temporary-devel"

inherit rpm
