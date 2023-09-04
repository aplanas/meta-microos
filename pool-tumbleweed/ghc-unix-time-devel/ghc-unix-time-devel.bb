SUMMARY = "Haskell unix-time library development files"
DESCRIPTION = "This package provides the Haskell unix-time library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-devel-0.4.10-1.3.aarch64.rpm"
RPM_HASH = "89b472bb4997542a7d51abf61dedd691934634c78c9aa516317af5bba4c5b94e2e38b137b9de8e79fc2980f3f8fbc5335de3c2b6249469ea1bf37a89b6917cba"

RPROVIDES:${PN} += "ghc-devel-unix-time-0.4.10-fuTENic3zHIuWAM5F0fYB \
ghc-unix-time-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-old-time-1.1.0.3-EO4BkAubfN4CLCS9qF8OKw \
ghc-unix-time"

inherit rpm
