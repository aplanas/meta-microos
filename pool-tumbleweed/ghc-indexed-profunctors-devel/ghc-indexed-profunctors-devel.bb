SUMMARY = "Haskell indexed-profunctors library development files"
DESCRIPTION = "This package provides the Haskell indexed-profunctors library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.1"

RPM_NAME = "ghc-indexed-profunctors-devel-0.1.1.1-1.2.aarch64.rpm"
RPM_HASH = "721650195dc565c31fe1d41d7544749f2ab8a644fdaf2eb7cbfdeae1489710bb96026205726a95fe7f77bcdd1bd8cf3fe990b162f55f1a0400d32908f8b59a5f"

RPROVIDES:${PN} += "ghc-devel-indexed-profunctors-0.1.1.1-8VFnw8ahpDVCAreg6vEIe9 \
ghc-indexed-profunctors-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-indexed-profunctors"

inherit rpm
