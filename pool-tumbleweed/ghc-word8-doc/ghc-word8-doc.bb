SUMMARY = "Haskell word8 library documentation"
DESCRIPTION = "This package provides the Haskell word8 library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-word8-doc-0.1.3-5.3.noarch.rpm"
RPM_HASH = "cd0a608a73052cc8238caac3d169816497e425a99de9869218fc51b56b9c2c8323176711c4a360f6665311f3182dbdbc6b3b4da01bec29791e8efa6ea6c1f4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-word8-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
