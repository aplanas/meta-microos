SUMMARY = "Haskell HUnit library documentation"
DESCRIPTION = "This package provides the Haskell HUnit library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-doc-1.6.2.0-2.3.noarch.rpm"
RPM_HASH = "14e95e46454d427e0061930fc18bf3a033928d7d4c50cbb84b04060c31e4f70adbba53433c8c3d2f0a912c6379b0071452d2a4d00f0a46e8c55a822e7f4b6569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HUnit-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
