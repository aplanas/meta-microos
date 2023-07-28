SUMMARY = "Haskell regex-tdfa library development files"
DESCRIPTION = "This package provides the Haskell regex-tdfa library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.2.1"

RPM_NAME = "ghc-regex-tdfa-devel-1.3.2.1-2.1.aarch64.rpm"
RPM_HASH = "089c6a416f2d0f4457134f8eb62236ca020e2a4a0cbff664d00031cbf22512809a104ae9f5653d1f4fe417716834d5e7f7b3d11270ca919c767897a4cded431c"

RPROVIDES:${PN} += "ghc-devel-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-regex-tdfa-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-devel-text-2.0.2 \
ghc-regex-tdfa"

inherit rpm
