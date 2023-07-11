SUMMARY = "Haskell vector-binary-instances library development files"
DESCRIPTION = "This package provides the Haskell vector-binary-instances library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.5.2"

RPM_NAME = "ghc-vector-binary-instances-devel-0.2.5.2-6.1.aarch64.rpm"
RPM_HASH = "064267ddbc3ce899bd5dc2cb2ebacdeb88abc8967037c17660a0f85216f27acfff9170c7cd34932222707f59ce093f539cfc432c4ac530b4403102342bc71b3f"

RPROVIDES:${PN} += "ghc-devel-vector-binary-instances-0.2.5.2-KcST7aCBDJmuBtN6ufmU8 \
ghc-vector-binary-instances-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-vector-binary-instances"

inherit rpm
