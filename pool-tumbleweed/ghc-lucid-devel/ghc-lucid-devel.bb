SUMMARY = "Haskell lucid library development files"
DESCRIPTION = "This package provides the Haskell lucid library development files."
LICENSE = "BSD-3-Clause"

PV = "2.11.20230408"

RPM_NAME = "ghc-lucid-devel-2.11.20230408-1.6.aarch64.rpm"
RPM_HASH = "2ee58d88a386f6d29d6976c472d0f3f37330df1789af04d32ab5ddb991a0e0dae1a20a860ae29bd37c9e957b9994f1030dd53d4fc6899ecffc9d288612631f56"

RPROVIDES:${PN} += "ghc-devel-lucid-2.11.20230408-4cKgK8hqgER6myHRF5jLTD \
ghc-lucid-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.3.0-IAiFPPoB7KF1SaZ2CDcpeP \
ghc-devel-mmorph-1.2.0-8vW65Nxa2ivI7uZwSjYXdn \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-lucid"

inherit rpm
