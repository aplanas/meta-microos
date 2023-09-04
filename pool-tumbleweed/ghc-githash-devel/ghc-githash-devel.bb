SUMMARY = "Haskell githash library development files"
DESCRIPTION = "This package provides the Haskell githash library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-devel-0.1.7.0-1.5.aarch64.rpm"
RPM_HASH = "8a66663d9e52ca348a5d0952047c7b62ef3e7c0fe0149357c672554ff1aa7fa1e0f430a8137d6964d2bf34016937edb08c13dcf35ac0786efcf1a9fefe9f1685"

RPROVIDES:${PN} += "ghc-devel-githash-0.1.7.0-AdGnnqehkm8HwhDMWfn4qF \
ghc-githash-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.17.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-compat-0.1.4-F5a7GnDk5rxHGhOle8BcYS \
ghc-githash"

inherit rpm
