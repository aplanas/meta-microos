SUMMARY = "Haskell th-abstraction profiling library"
DESCRIPTION = "This package provides the Haskell th-abstraction profiling library."
LICENSE = "ISC"

PV = "0.4.5.0"

RPM_NAME = "ghc-th-abstraction-prof-0.4.5.0-2.8.aarch64.rpm"
RPM_HASH = "af525711bd7b998fe975b322eea670f2756cfc63234731863ed9e08268e92abb76975260eb4c2a1b46e8298e65793c933365fb0b7e8487b1d664a2999e7460a9"

RPROVIDES:${PN} += "ghc-prof-th-abstraction-0.4.5.0-CynkUuS8OuAKbGjDnje1Fs \
ghc-th-abstraction-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-th-abstraction-devel"

inherit rpm
