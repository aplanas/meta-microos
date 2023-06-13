SUMMARY = "Haskell unordered-containers library documentation"
DESCRIPTION = "This package provides the Haskell unordered-containers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.19.1"

RPM_NAME = "ghc-unordered-containers-doc-0.2.19.1-3.3.noarch.rpm"
RPM_HASH = "39a298408be9fcde466961d2b7e77d02dc0a6ae32c405c52ae87b2b5441ffac778a11c6dd457f00088b3122c6cda1abfc401a1c5d35ff757340f6ea0012152f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unordered-containers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
