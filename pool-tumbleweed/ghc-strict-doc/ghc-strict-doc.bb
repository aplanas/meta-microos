SUMMARY = "Haskell strict library documentation"
DESCRIPTION = "This package provides the Haskell strict library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5"

RPM_NAME = "ghc-strict-doc-0.5-1.3.noarch.rpm"
RPM_HASH = "e8f2db682490ed11c1af0a3ffd6aab0a8fa3559f0d887c25f9ea00a3a1df405cd2bd4b878e609451c8d8c75a8dd3f7998bcb4f6cdb4d507a6ed2817a2ce4f9f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-strict-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
