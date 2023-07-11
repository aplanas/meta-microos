SUMMARY = "Haskell microlens-platform profiling library"
DESCRIPTION = "This package provides the Haskell microlens-platform profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-prof-0.4.3.3-2.4.aarch64.rpm"
RPM_HASH = "ee7fd6ea5a0b6063aa90e3358a0655c33c09b0b6257534279c5e21d79dcc19dc4f04759c4f17a94d69c80638993036ca3106b70b4ecc70d4f12873b5846e576c"

RPROVIDES:${PN} += "ghc-microlens-platform-prof \
ghc-prof-microlens-platform-0.4.3.3-Cix3OOw3ZFyD9flb3xi2EO"

RDEPENDS:${PN} += "ghc-microlens-platform-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-prof-microlens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB \
ghc-prof-microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV \
ghc-prof-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-prof-text-2.0.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
