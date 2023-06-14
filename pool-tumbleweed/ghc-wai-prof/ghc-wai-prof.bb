SUMMARY = "Haskell wai profiling library"
DESCRIPTION = "This package provides the Haskell wai profiling library."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "ghc-wai-prof-3.2.3-2.2.aarch64.rpm"
RPM_HASH = "a9212596853b2ad7421a2b940182600ca3892adc5eaeeb99b3b4c5a534523de21999e8da3fc9718f04387ef3cb962fef0f8387da81ae76a4d7808684f0ffaa30"

RPROVIDES:${PN} += "ghc-prof-wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn \
ghc-wai-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-text-2.0.2 \
ghc-prof-vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc \
ghc-wai-devel"

inherit rpm
