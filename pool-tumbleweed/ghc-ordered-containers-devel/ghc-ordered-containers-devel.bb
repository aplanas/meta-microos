SUMMARY = "Haskell ordered-containers library development files"
DESCRIPTION = "This package provides the Haskell ordered-containers library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "ghc-ordered-containers-devel-0.2.3-1.5.aarch64.rpm"
RPM_HASH = "aed3a6ba070982cdfc7a79d1f33b8cda530641ecf3f8cc7e8172e48af7dd27bb6fd9ff5fb60de1a8865551d3118859f510c3d823b94797144db7aa016ad7604e"

RPROVIDES:${PN} += "ghc-devel-ordered-containers-0.2.3-2crAZfphMSgLuheOQx40mM \
ghc-ordered-containers-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-ordered-containers"

inherit rpm
