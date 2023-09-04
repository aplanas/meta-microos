SUMMARY = "Haskell edit-distance library development files"
DESCRIPTION = "This package provides the Haskell edit-distance library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.1"

RPM_NAME = "ghc-edit-distance-devel-0.2.2.1-13.8.aarch64.rpm"
RPM_HASH = "79af9ac582f75a74023a2797a560e358ee2aa16ffa45e1fb0f4d7190f8cc58a0881098c8a40a46afa353e6a0daaa0ba7a0d457d7606a42d208d59c5304a8a8d0"

RPROVIDES:${PN} += "ghc-devel-edit-distance-0.2.2.1-ITBK6JvlsOE36MkOzN30LX \
ghc-edit-distance-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-random-1.2.1.1-DaR3VtSJjyj4XXOpfKJ29k \
ghc-edit-distance"

inherit rpm
