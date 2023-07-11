SUMMARY = "Haskell fsnotify library documentation"
DESCRIPTION = "This package provides the Haskell fsnotify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.0"

RPM_NAME = "ghc-fsnotify-doc-0.4.1.0-2.7.noarch.rpm"
RPM_HASH = "a7c94d14db19a3a6620ce60510e04c0d261f07359b301212bb7129c180443df2c2eb9000c55b1e31f1d8b911c176510166dba096ffc443f4837b1eaa6effb0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fsnotify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
