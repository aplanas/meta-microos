SUMMARY = "Haskell th-lift-instances library development files"
DESCRIPTION = "This package provides the Haskell th-lift-instances library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.20"

RPM_NAME = "ghc-th-lift-instances-devel-0.1.20-2.2.aarch64.rpm"
RPM_HASH = "20fef1f80b6f21ee43803132872f60609c18cf7978be5d83c49e00e8df36b391be7f4322a2eb898c0a8e9a67d25c6818bde0c93bdbfcf7199e9d9be4fb3fb836"

RPROVIDES:${PN} += "ghc-devel-th-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx \
ghc-th-lift-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-0.8.3-BVnK9vFPlpnBx7d6MzGvJN \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-th-lift-instances"

inherit rpm
