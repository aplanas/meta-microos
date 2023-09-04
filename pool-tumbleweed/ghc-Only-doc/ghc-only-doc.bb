SUMMARY = "Haskell Only library documentation"
DESCRIPTION = "This package provides the Haskell Only library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-doc-0.1-6.1.noarch.rpm"
RPM_HASH = "98e1aaff41824d4836f03881a9e045331571157a7d998bd6726215e09676c891737018557efeb5b36c11972e08197063888c4d974c9bf44819ea23246ae414bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-Only-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
