SUMMARY = "Haskell alsa-core library development files"
DESCRIPTION = "This package provides the Haskell alsa-core library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-devel-0.5.0.1-4.3.aarch64.rpm"
RPM_HASH = "40061589e56b860858c288310b2cf02c98c8459e9a1d1b67bbf5cf2e0e3059edd89445b6a3201af9400559d17e295a9d4203771ea4e28ede92c65fca01ad17de"

RPROVIDES:${PN} += "ghc-alsa-core-devel \
ghc-devel-alsa-core-0.5.0.1-JiFJwdvZ0Gx6AeuqXKf7yg"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-alsa-core \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-extensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY \
pkgconfig \
pkgconfig-alsa"

inherit rpm
