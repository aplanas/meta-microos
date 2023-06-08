SUMMARY = "Haskell microlens-platform library development files"
DESCRIPTION = "This package provides the Haskell microlens-platform library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-devel-0.4.3.3-2.3.aarch64.rpm"
RPM_HASH = "2149d7a7891125000946fac9097c91a8cd7c84efa9eeacd7f64f197ec5ceb5a53f74e7972cfc32f5dda1f026b83266d0a28ae2653dd10015fe1e342de21bb44a"

RPROVIDES:${PN} += "ghc-devel(microlens-platform-0.4.3.3-9nLg9j7jRAiHEY5VUSmG6h) ghc-microlens-platform-devel ghc-microlens-platform-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) ghc-devel(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) ghc-devel(microlens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB) ghc-devel(microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV) ghc-devel(microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG) ghc-devel(text-2.0.2) ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) ghc-microlens-platform"

inherit rpm
