SUMMARY = "Haskell distributive library documentation"
DESCRIPTION = "This package provides the Haskell distributive library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-doc-0.6.2.1-3.4.noarch.rpm"
RPM_HASH = "e5957624208ca55a454474d33a789dc6d74df4e06c33f351fdfd6322c37a8de34d8f46f2d52c65a2737b6bbb1e693152bb133c3fec5fbbf557af1b85e92acc3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-distributive-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
