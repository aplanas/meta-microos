SUMMARY = "GHC library documentation indexing"
DESCRIPTION = "The package enables re-indexing of installed library documention."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-doc-index-9.4.6-1.1.noarch.rpm"
RPM_HASH = "8f5fdfbce742a1b40e792cef33d95c937bde29bbd54fa1742814d8ae30f0a5fbeec0b4f0674fb82f40fe91262368d9a78dba9e4eee85ae3e7c73dd7e21b3f0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-doc-index"

RDEPENDS:${PN} += "ghc-compiler"

inherit rpm
