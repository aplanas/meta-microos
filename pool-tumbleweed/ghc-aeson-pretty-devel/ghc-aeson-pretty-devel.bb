SUMMARY = "Haskell aeson-pretty library development files"
DESCRIPTION = "This package provides the Haskell aeson-pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-aeson-pretty-devel-0.8.10-1.1.aarch64.rpm"
RPM_HASH = "5e7fd5adef4a1b0dd42ae1df46f04dad01fc00683a0aca4a604f623ff1f84523e5eade34292c713c2191714f339ca96634061d6ef9fc8c17d8f3e27ceba364c5"

RPROVIDES:${PN} += "ghc-aeson-pretty-devel \
ghc-devel-aeson-pretty-0.8.10-8JRVLG9BqWz7B95FOCRy0B"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-aeson-pretty \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-base-compat-0.13.0-Cvz3167VMpo6rdOohSlum3 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
