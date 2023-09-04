SUMMARY = "Haskell foldable1-classes-compat library development files"
DESCRIPTION = "This package provides the Haskell foldable1-classes-compat library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-foldable1-classes-compat-devel-0.1-2.2.aarch64.rpm"
RPM_HASH = "e39e8df703b0e0d789154637a2c115160be886cd471e5f2a803b243a57103553c1987afd823a128d4b8ec234a8aef7f03a314540f7dbd7b53ed31fa6788aa968"

RPROVIDES:${PN} += "ghc-devel-foldable1-classes-compat-0.1-HnLXxvPXYXbHggM07qAxsy \
ghc-foldable1-classes-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2 \
ghc-foldable1-classes-compat"

inherit rpm
