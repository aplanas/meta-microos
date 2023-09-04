SUMMARY = "Haskell memory library development files"
DESCRIPTION = "This package provides the Haskell memory library development files."
LICENSE = "BSD-3-Clause"

PV = "0.18.0"

RPM_NAME = "ghc-memory-devel-0.18.0-2.9.aarch64.rpm"
RPM_HASH = "87e796101e25caf55846ecfc69e8fb9059683a8bd6561d1beb4b2ef39d294e82bce77088cfff26b9206dca8cf50f3cb404274aa851c89a46f89c7021847e7520"

RPROVIDES:${PN} += "ghc-devel-memory-0.18.0-6jbQrbksm9m3FIftlSlmf1 \
ghc-memory-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-basement-0.0.16-JDtFhm6hoERETf7Hqk4dh9 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-memory"

inherit rpm
