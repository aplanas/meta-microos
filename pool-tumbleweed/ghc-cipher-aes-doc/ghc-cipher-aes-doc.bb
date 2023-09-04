SUMMARY = "Haskell cipher-aes library documentation"
DESCRIPTION = "This package provides the Haskell cipher-aes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-doc-0.2.11-4.5.noarch.rpm"
RPM_HASH = "29f6ae7d578786d828324f1375b71b113780b6f03c93c2b82b2d78e5a5b4aa7088a61fbfd8dd6f99a0d133dd6e3fa0620a76728da6a91b2af39540ff96fc5497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cipher-aes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
