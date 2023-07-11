SUMMARY = "Haskell binary library development files"
DESCRIPTION = "This package provides the Haskell binary library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-devel-0.8.9.1-3.2.aarch64.rpm"
RPM_HASH = "81e0c6fafae2644872122690c2d0a579256d356f1888132ec256d4bcf93c2abc0487361d9d2dd0945e76b3854c3706d22fbb3be78fd1849b39f7f6cee5d4764f"

RPROVIDES:${PN} += "ghc-binary-devel \
ghc-binary-static \
ghc-devel-binary-0.8.9.1"

RDEPENDS:${PN} += "ghc-binary \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7"

inherit rpm
