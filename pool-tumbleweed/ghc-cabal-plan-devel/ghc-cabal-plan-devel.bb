SUMMARY = "Haskell cabal-plan library development files"
DESCRIPTION = "This package provides the Haskell cabal-plan library development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-devel-0.7.3.0-2.1.aarch64.rpm"
RPM_HASH = "92c8ffb35c38225dcb6d863aefe973ab5e43cad88395a3c012cc3807eed84a43e679ef08d245ece0cf88c5b35289bb53dba3435cfd4b47b976ee07b2261af1c5"

RPROVIDES:${PN} += "ghc-cabal-plan-devel \
ghc-devel-cabal-plan-0.7.3.0-6cjqkAQfbyh3TLSGEHoT4c"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-cabal-plan \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-text-2.0.2"

inherit rpm
