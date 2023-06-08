SUMMARY = "Haskell ghc-boot-th library documentation"
DESCRIPTION = "This package provides the Haskell ghc-boot-th library documentation."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-th-doc-9.4.5-1.1.noarch.rpm"
RPM_HASH = "e9baca33abed4aaa7d43dbaf7fccae4a1dad9cc542d956d1eba93292eab05f1c56580af8ed598fe06be01ee2f7e201758056b5044c44f05a961d86071ce9713c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-ghc-boot-th-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
