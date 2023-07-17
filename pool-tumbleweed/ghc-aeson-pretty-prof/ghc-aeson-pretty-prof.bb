SUMMARY = "Haskell aeson-pretty profiling library"
DESCRIPTION = "This package provides the Haskell aeson-pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.10"

RPM_NAME = "ghc-aeson-pretty-prof-0.8.10-1.1.aarch64.rpm"
RPM_HASH = "f878f9c2f7c2084d5607f76017128138e7d967e0893834dbf51be96fe6c5e3cd229700fcc72b2a2cc87d709eeb14de4fd8f65bfac9c9c0aa605ed457a753f24f"

RPROVIDES:${PN} += "ghc-aeson-pretty-prof \
ghc-prof-aeson-pretty-0.8.10-8JRVLG9BqWz7B95FOCRy0B"

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
