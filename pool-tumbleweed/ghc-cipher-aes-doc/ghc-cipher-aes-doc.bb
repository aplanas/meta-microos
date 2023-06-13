SUMMARY = "Haskell cipher-aes library documentation"
DESCRIPTION = "This package provides the Haskell cipher-aes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-doc-0.2.11-4.2.noarch.rpm"
RPM_HASH = "19b0ae1a2016a8564775fbb40de89e8fb03b60ab9f384626ef10cfc61c21c0226409ab63aef9eb215d14f2801013ace0eb533287ab6efae4048d60d13fb42af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cipher-aes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
