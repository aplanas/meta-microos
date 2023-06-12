SUMMARY = "Haskell disk-free-space library documentation"
DESCRIPTION = "This package provides the Haskell disk-free-space library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-doc-0.1.0.1-5.2.noarch.rpm"
RPM_HASH = "f57aeded5ce55b01f97f29ea09fa82ec15080a78a9b174615c31d22d2ee62033a7fa3fe97ec6b83ef900177102dbcaee4b5e136783c183bab1eaf8bfca7a2718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-disk-free-space-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
