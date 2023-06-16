SUMMARY = "Haskell pretty-hex library development files"
DESCRIPTION = "This package provides the Haskell pretty-hex library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "ghc-pretty-hex-devel-1.1-4.2.aarch64.rpm"
RPM_HASH = "ce498249fd4b6d4ca0226d1139ec787b405de840c39a5b4c3199b3f76259deca166cdbde85a1647dbfad5d55a104216d6f55c8f02fd886f5abf8c404f7f2f7c3"

RPROVIDES:${PN} += "ghc-devel-pretty-hex-1.1-2861Nkv8pS0CIRpZJwwJMG \
ghc-pretty-hex-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-pretty-hex"

inherit rpm
