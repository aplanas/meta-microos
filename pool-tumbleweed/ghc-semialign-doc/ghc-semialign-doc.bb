SUMMARY = "Haskell semialign library documentation"
DESCRIPTION = "This package provides the Haskell semialign library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "ghc-semialign-doc-1.3-1.6.noarch.rpm"
RPM_HASH = "f414c0773c0c5b2a116e64005a5eab74f5e45107a27cf7c8e72d46ecda982c8fa77bb57f4b58afc6a22e86686b963b4d0103a8163456f8db659db4bf2eed1bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-semialign-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
