SUMMARY = "Haskell hslua-packaging library documentation"
DESCRIPTION = "This package provides the Haskell hslua-packaging library documentation."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-doc-2.3.0-1.8.noarch.rpm"
RPM_HASH = "78ec6b12e9dfd5a210de108285e79c3ee21d1b75c0a4e95624dcd172a220bbfb7329e0e9177f528b044f4688f732d1d28ccefc714c15dac1fcbfa2a3ac841941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-packaging-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
