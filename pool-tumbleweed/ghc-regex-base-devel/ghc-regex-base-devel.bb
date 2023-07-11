SUMMARY = "Haskell regex-base library development files"
DESCRIPTION = "This package provides the Haskell regex-base library development files."
LICENSE = "BSD-3-Clause"

PV = "0.94.0.2"

RPM_NAME = "ghc-regex-base-devel-0.94.0.2-3.6.aarch64.rpm"
RPM_HASH = "b22bea1aff6ef57088dd3432ac6f5ac915cec2721682a3fea636310f12c46e537ae3133371720d4ce079d40ec4475293986675d4ac2d589bf05874f122b342df"

RPROVIDES:${PN} += "ghc-devel-regex-base-0.94.0.2-8EhYuxSr6UD5zE7cP6wrkq \
ghc-regex-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-regex-base"

inherit rpm
