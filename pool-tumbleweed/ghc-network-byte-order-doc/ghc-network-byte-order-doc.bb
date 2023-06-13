SUMMARY = "Haskell network-byte-order library documentation"
DESCRIPTION = "This package provides the Haskell network-byte-order library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-network-byte-order-doc-0.1.6-4.2.noarch.rpm"
RPM_HASH = "1df881511f0384b875718257aa3101a5e89e615f3b040b9c7f014ade27112686f1c4865d798c64e0a660bfab809ba35323f2e9eb73dbef94ce40f569f93e1af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-network-byte-order-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
