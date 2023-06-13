SUMMARY = "Haskell containers library development files"
DESCRIPTION = "This package provides the Haskell containers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-devel-0.6.7-3.1.aarch64.rpm"
RPM_HASH = "9f1d2caa7d22ca026edc84c84db81b3a80312f1d1eb78bde347b67eacefa87dcca5207b7dbb9f60fa67fc8606d7b7046e010723e2aa6d21428ff69b70bedfd21"

RPROVIDES:${PN} += "ghc-containers-devel \
ghc-containers-devel(aarch-64) \
ghc-containers-static \
ghc-containers-static(aarch-64) \
ghc-devel(containers-0.6.7)"

RDEPENDS:${PN} += "ghc-compiler \
ghc-containers(aarch-64) \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(template-haskell-2.19.0.0)"

inherit rpm
