SUMMARY = "Haskell microstache profiling library"
DESCRIPTION = "This package provides the Haskell microstache profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-prof-1.0.2.3-3.2.aarch64.rpm"
RPM_HASH = "1e68aa35dd809f4320ae2acde50d44944c43bf677536035ec61ee5d537379e463f5d60f43eb0775b4ec1c7b7a793de25ccfdf65239621db22bdae20674f6dca0"

RPROVIDES:${PN} += "ghc-microstache-prof \
ghc-prof-microstache-1.0.2.3-HPIMoirZDKg7hPtdxDNWtL"

RDEPENDS:${PN} += "ghc-microstache-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
