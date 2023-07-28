SUMMARY = "Haskell cabal-plan profiling library"
DESCRIPTION = "This package provides the Haskell cabal-plan profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-prof-0.7.3.0-2.1.aarch64.rpm"
RPM_HASH = "06f7fe04bed9598ca5bae11604ffcd1dd64972b737488d2bf0a1a68295748d9c1aeb78620c47d40c9be6593141ca94103d6110d4afc9fa761675d43a00cb278a"

RPROVIDES:${PN} += "ghc-cabal-plan-prof \
ghc-prof-cabal-plan-0.7.3.0-6cjqkAQfbyh3TLSGEHoT4c"

RDEPENDS:${PN} += "ghc-cabal-plan-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
