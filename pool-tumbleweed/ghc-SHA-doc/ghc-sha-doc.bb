SUMMARY = "Haskell SHA library documentation"
DESCRIPTION = "This package provides the Haskell SHA library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.4.4"

RPM_NAME = "ghc-SHA-doc-1.6.4.4-8.3.noarch.rpm"
RPM_HASH = "3e7e3c6be73318377219d74451a6306d8d2cf8828079e67df9d9b18ea520a280edc78fe377071cfbc694c816609bcd61c5df50c94bf2adde49410ac67e50c20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-SHA-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
