SUMMARY = "Haskell basement library development files"
DESCRIPTION = "This package provides the Haskell basement library development files."
LICENSE = "BSD-3-Clause"

PV = "0.0.15"

RPM_NAME = "ghc-basement-devel-0.0.15-2.3.aarch64.rpm"
RPM_HASH = "0b1bffeece5fd96ed4c1acb947a8f9d935a83ee41f55f1ea16d0231d4d0bc46f7ca84c437c9401a81d579ba550ca357ce7cae8a8dcff77fb3421208a3d24ea20"

RPROVIDES:${PN} += "ghc-basement-devel \
ghc-devel-basement-0.0.15-6OmKTVi2kFpCWMoKDlsO4S"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-basement \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0"

inherit rpm
