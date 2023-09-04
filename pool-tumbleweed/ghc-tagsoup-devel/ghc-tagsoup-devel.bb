SUMMARY = "Haskell tagsoup library development files"
DESCRIPTION = "This package provides the Haskell tagsoup library development files."
LICENSE = "BSD-3-Clause"

PV = "0.14.8"

RPM_NAME = "ghc-tagsoup-devel-0.14.8-6.8.aarch64.rpm"
RPM_HASH = "9db7b894d7b48935577b0ec6bc7c07af5918fbffeca313c6ae7e67f8cb1a295e0cf06fec07727316f989772d9143c7933a99b990f8730126eb6ba62a4ff736ef"

RPROVIDES:${PN} += "ghc-devel-tagsoup-0.14.8-FUMcGuRz5feAeL2vCCRpAn \
ghc-tagsoup-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-text-2.0.2 \
ghc-tagsoup"

inherit rpm
