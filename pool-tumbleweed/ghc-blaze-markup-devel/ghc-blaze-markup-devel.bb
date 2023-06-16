SUMMARY = "Haskell blaze-markup library development files"
DESCRIPTION = "This package provides the Haskell blaze-markup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.2.8"

RPM_NAME = "ghc-blaze-markup-devel-0.8.2.8-5.3.aarch64.rpm"
RPM_HASH = "361bd8149cde48e7dcd0367853d3bccaa2364273f29aaf4871c8fd6e1439275b8583545541e286881defe2fd49bc5eda01429a0b649d918d25b3f1ad67d27df2"

RPROVIDES:${PN} += "ghc-blaze-markup-devel \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-blaze-markup \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-builder-0.4.2.2-1GcRIc7N7YHId5Q5gRvlvW \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-text-2.0.2"

inherit rpm
