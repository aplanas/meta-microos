SUMMARY = "Haskell skylighting-format-context library development files"
DESCRIPTION = "This package provides the Haskell skylighting-format-context library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.2"

RPM_NAME = "ghc-skylighting-format-context-devel-0.1.0.2-1.4.aarch64.rpm"
RPM_HASH = "e6b9c6a61679443b896989fd9ec9fd940a619cd64b390bfc84487c224b38a31996e601fb476ab4408fda8f005275a2a4324eaf5614af0aa4f091065c0cc7e2f5"

RPROVIDES:${PN} += "ghc-devel-skylighting-format-context-0.1.0.2-9kgX49cteJhG5oRziiwfwa \
ghc-skylighting-format-context-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-skylighting-core-0.13.3-9hBRKYwyArU4OdEqV8LbQv \
ghc-devel-text-2.0.2 \
ghc-skylighting-format-context"

inherit rpm
