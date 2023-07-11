SUMMARY = "Haskell cabal-plan profiling library"
DESCRIPTION = "This package provides the Haskell cabal-plan profiling library."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.3.0"

RPM_NAME = "ghc-cabal-plan-prof-0.7.3.0-1.2.aarch64.rpm"
RPM_HASH = "54ad9cc6adbf2ea2bc8d2bd570fabd4c9170507fddcbac9a9c2df5aca3592d167f4780f3b659062756f3d2c364a263afd3b8b2f87db74ad1189a760b2eac29aa"

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
