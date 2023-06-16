SUMMARY = "Haskell unix-time library development files"
DESCRIPTION = "This package provides the Haskell unix-time library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "ghc-unix-time-devel-0.4.9-1.3.aarch64.rpm"
RPM_HASH = "fa5d1dd90c99331028541a534e1a610c6e1293d791e1a35497828db33e6e34830b3f34bd340cec07ab9bc683a45199924675de23d003c92850a660f36d627c45"

RPROVIDES:${PN} += "ghc-devel-unix-time-0.4.9-DrdwBL0FLhc5jN9Hujlou0 \
ghc-unix-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-unix-time"

inherit rpm
