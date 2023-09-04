SUMMARY = "Haskell time-manager library development files"
DESCRIPTION = "This package provides the Haskell time-manager library development files."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "ghc-time-manager-devel-0.0.1-1.1.aarch64.rpm"
RPM_HASH = "0413a7bdc3c5bbc764475036eae3a52c57e4765969b424456d5146d7c6985d442a2662cf584fbdfcec0d0282d99541fd82c06697c5ad1d402d49c85bec72a4b5"

RPROVIDES:${PN} += "ghc-devel-time-manager-0.0.1-8jNNuzTBrN1AP9vZ7ZYdJS \
ghc-time-manager-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-auto-update-0.1.6-KWXusmyBOlPJNN5shLt5Bc \
ghc-devel-base-4.17.2.0 \
ghc-devel-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-time-manager"

inherit rpm
