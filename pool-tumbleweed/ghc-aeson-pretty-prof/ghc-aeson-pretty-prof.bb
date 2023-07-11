SUMMARY = "Haskell aeson-pretty profiling library"
DESCRIPTION = "This package provides the Haskell aeson-pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "ghc-aeson-pretty-prof-0.8.9-4.3.aarch64.rpm"
RPM_HASH = "e647558860e70958c2bf6d711ffede920cc52c3c3d199d1907365422eea1ae7b61b0aea17bf790898076635bc4bc88eff245caad7a6d398ab8f0a68a7b5d7f45"

RPROVIDES:${PN} += "ghc-aeson-pretty-prof \
ghc-prof-aeson-pretty-0.8.9-ANiMUyahKok8eMC9BUYvO0"

RDEPENDS:${PN} += "ghc-aeson-pretty-devel \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
