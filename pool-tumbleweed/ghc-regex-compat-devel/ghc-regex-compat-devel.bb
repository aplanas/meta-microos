SUMMARY = "Haskell regex-compat library development files"
DESCRIPTION = "This package provides the Haskell regex-compat library development files."
LICENSE = "BSD-3-Clause"

PV = "0.95.2.1"

RPM_NAME = "ghc-regex-compat-devel-0.95.2.1-4.2.aarch64.rpm"
RPM_HASH = "f6a91a0b3bb7a24fb2e82e2d9af97d93372f5fc5388e31daa2a3eb03f923aa94f6213b4fbd655a79f0e4541730af84b2f92271f841db74f8b5375148e36b738b"

RPROVIDES:${PN} += "ghc-devel(regex-compat-0.95.2.1-9I4JwtnoxVY9Cu5lIL0XLJ) \
ghc-regex-compat-devel \
ghc-regex-compat-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq) \
ghc-devel(regex-posix-0.96.0.1-Db56rsDUom23lFxliY5wt1) \
ghc-regex-compat"

inherit rpm
