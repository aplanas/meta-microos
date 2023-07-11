SUMMARY = "Haskell microlens-platform library development files"
DESCRIPTION = "This package provides the Haskell microlens-platform library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.3.3"

RPM_NAME = "ghc-microlens-platform-devel-0.4.3.3-2.4.aarch64.rpm"
RPM_HASH = "a8744de9749a4c017f9d471ffd9d58848aca4c708932e7c5ca7cba28d4ea3765d2a6b8525b345e772fd4568a4113625271d09b4ceacf836715fe75d544184b11"

RPROVIDES:${PN} += "ghc-devel-microlens-platform-0.4.3.3-Cix3OOw3ZFyD9flb3xi2EO \
ghc-microlens-platform-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-microlens-ghc-0.4.14.1-4Q8SZXKkgj872LFERorIGB \
ghc-devel-microlens-mtl-0.2.0.3-50s7aKrmu33tjGZvdN4FV \
ghc-devel-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-devel-text-2.0.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-microlens-platform"

inherit rpm
