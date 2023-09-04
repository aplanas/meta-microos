SUMMARY = "Haskell topograph library documentation"
DESCRIPTION = "This package provides the Haskell topograph library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.2"

RPM_NAME = "ghc-topograph-doc-1.0.0.2-2.4.noarch.rpm"
RPM_HASH = "147fea1417e78838a12533dfefd24ade8719f9a9f958ebf27127574bdfb586bdb2529b93a9370b6f62057517089eb0ad5e0ec95dde08d54af21be698b95ceef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-topograph-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
