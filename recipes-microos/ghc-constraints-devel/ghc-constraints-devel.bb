SUMMARY = "Haskell constraints library development files"
DESCRIPTION = "This package provides the Haskell constraints library development files."
LICENSE = "BSD-2-Clause"

PV = "0.13.4"

RPM_NAME = "ghc-constraints-devel-0.13.4-2.3.aarch64.rpm"
RPM_HASH = "39de6ae31730893e8c9f447ffe2cd456909e7bc667b8aca292b17b5c82daa920fbc42f19d2c145537ba041bdbb14b779c50543378c3619ae4e632335be2a2eb5"

RPROVIDES:${PN} += "ghc-constraints-devel ghc-constraints-devel(aarch-64) ghc-devel(constraints-0.13.4-8c0InBhz3htJzug27IqVE7)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-constraints ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(deepseq-1.4.8.0) ghc-devel(ghc-prim-0.9.0) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(mtl-2.2.2) ghc-devel(transformers-0.5.6.2) ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) ghc-devel(type-equality-1-FqVAbwBXnIKCXHvrA6xdY8)"

inherit rpm
