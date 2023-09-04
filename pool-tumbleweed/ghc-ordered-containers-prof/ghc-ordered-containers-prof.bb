SUMMARY = "Haskell ordered-containers profiling library"
DESCRIPTION = "This package provides the Haskell ordered-containers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-prof-0.2.3-1.5.aarch64.rpm"
RPM_HASH = "dbfd956e6e9a3971e429d1c73af39b9327e3372062a8a3d5d0c9797aa78d1b664f05c09b295b044189a7d87fd0a1696eb154f560a257b3594014be19ee3f9d33"

RPROVIDES:${PN} += "ghc-ordered-containers-prof \
ghc-prof-ordered-containers-0.2.3-2crAZfphMSgLuheOQx40mM"

RDEPENDS:${PN} += "ghc-ordered-containers-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7"

inherit rpm
