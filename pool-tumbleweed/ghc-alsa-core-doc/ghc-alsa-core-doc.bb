SUMMARY = "Haskell alsa-core library documentation"
DESCRIPTION = "This package provides the Haskell alsa-core library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.0.1"

RPM_NAME = "ghc-alsa-core-doc-0.5.0.1-4.4.noarch.rpm"
RPM_HASH = "406816e574fb6b1b8a2e52f050ca915743610100113ed66ec12bba7f8a6a1d9ae1277f528ee0f07082cf1f3f347a3325c1b754f10911b6f7bb18d50caff20e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-alsa-core-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
