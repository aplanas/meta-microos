SUMMARY = "Haskell warp-tls library documentation"
DESCRIPTION = "This package provides the Haskell warp-tls library documentation."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-doc-3.3.6-1.8.noarch.rpm"
RPM_HASH = "f9a641ee58b26520baad3d2612a9dfe64038d9b7d127b26e334802495567dfa3692795c3ec65f0ef1df0b6a20a7fc48e03b8dc5cf14dfb2addcceb39847fc91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
