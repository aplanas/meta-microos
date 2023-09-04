SUMMARY = "Haskell tabular library development files"
DESCRIPTION = "This package provides the Haskell tabular library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-devel-0.2.2.8-4.8.aarch64.rpm"
RPM_HASH = "a7eac7679eb60acd72dcab43b77a680b2e72f5afbc2655dacd42fa7e0df02b7335aa0183890a42190f5eea1f76d7a3b0d73de3e76d6c2f389ee06f0e6e76c32a"

RPROVIDES:${PN} += "ghc-devel-tabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM \
ghc-tabular-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-csv-0.1.2-D7ZtQLgQlciDV3aF4oWKCf \
ghc-devel-html-1.0.1.2-Ei0LKBl3CyAHMF3GZI2hqu \
ghc-devel-mtl-2.2.2 \
ghc-tabular"

inherit rpm
