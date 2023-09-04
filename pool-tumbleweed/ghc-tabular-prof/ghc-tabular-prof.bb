SUMMARY = "Haskell tabular profiling library"
DESCRIPTION = "This package provides the Haskell tabular profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-prof-0.2.2.8-4.8.aarch64.rpm"
RPM_HASH = "4fc5b56698517a2916da389abc063ec189512ee64b9c3c3e20f053c60dfd9d06eaecf64e1062fd9ee96fd3d6ed0bb3634eec4ce424c61220723506e838922f7d"

RPROVIDES:${PN} += "ghc-prof-tabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM \
ghc-tabular-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-csv-0.1.2-D7ZtQLgQlciDV3aF4oWKCf \
ghc-prof-html-1.0.1.2-Ei0LKBl3CyAHMF3GZI2hqu \
ghc-prof-mtl-2.2.2 \
ghc-tabular-devel"

inherit rpm
