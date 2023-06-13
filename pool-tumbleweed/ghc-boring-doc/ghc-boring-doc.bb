SUMMARY = "Haskell boring library documentation"
DESCRIPTION = "This package provides the Haskell boring library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-doc-0.2.1-1.2.noarch.rpm"
RPM_HASH = "e7ccd8a8f709384d066e11d3fd9037b879b718220a8032cf8eb98945f1338dd3c649fde2167edc24b8610629c6816b5658d8ecaef0d03453e93204ab977471dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-boring-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
