SUMMARY = "Haskell Diff library development files"
DESCRIPTION = "This package provides the Haskell Diff library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-Diff-devel-0.4.1-2.6.aarch64.rpm"
RPM_HASH = "7f8776cf274e1ffdc188dde5a70b693a7b60b95f64f64b1aa072031f8b3186a25fb86089cc0805281fba3eab89becc6a3193cf76e91e360ce1f167f2aa5d604b"

RPROVIDES:${PN} += "ghc-Diff-devel \
ghc-devel-Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-Diff \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-pretty-1.1.3.6"

inherit rpm
