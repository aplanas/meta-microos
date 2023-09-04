SUMMARY = "Haskell vector-binary-instances library development files"
DESCRIPTION = "This package provides the Haskell vector-binary-instances library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-devel-0.2.5.2-6.2.aarch64.rpm"
RPM_HASH = "87315cef0e6c2153de609c840d0e572bcd74077747604b0f5eb4783bed023a28bd5e807b5440e2f4dc5e90316dcbea5d5f33653cbae7c05000eee23e631c2347"

RPROVIDES:${PN} += "ghc-devel-vector-binary-instances-0.2.5.2-DYVTg98S1IFCZ0TRySxTVW \
ghc-vector-binary-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-vector-binary-instances"

inherit rpm
