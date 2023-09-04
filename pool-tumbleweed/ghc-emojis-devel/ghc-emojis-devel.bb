SUMMARY = "Haskell emojis library development files"
DESCRIPTION = "This package provides the Haskell emojis library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-emojis-devel-0.1.3-1.2.aarch64.rpm"
RPM_HASH = "bfd22b029814debee786511dd53efcf7dbbc3c8cb504488516067bb1a80ee42494947d27494bd0da2dbe675ea3b463acae285f46ea56f8b70340fa0a1fa61936"

RPROVIDES:${PN} += "ghc-devel-emojis-0.1.3-7wpttN9DVlcBjh9pp4W5jK \
ghc-emojis-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-emojis"

inherit rpm
