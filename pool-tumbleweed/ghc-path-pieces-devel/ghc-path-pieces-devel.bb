SUMMARY = "Haskell path-pieces library development files"
DESCRIPTION = "This package provides the Haskell path-pieces library development files."
LICENSE = "BSD-2-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-path-pieces-devel-0.2.1-12.3.aarch64.rpm"
RPM_HASH = "03317c47438559ec4eb8f2e9a79a0553d3760fb0cb008b6f161eceeec9e8a4ae82a73d30bcb0c24bc6a9706eede40fe04b45a8cdd930f369833f00c297df62a0"

RPROVIDES:${PN} += "ghc-devel-path-pieces-0.2.1-JEJ6IegDP1FHzqmKWi176n \
ghc-path-pieces-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-path-pieces"

inherit rpm
