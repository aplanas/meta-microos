SUMMARY = "Haskell typed-process library documentation"
DESCRIPTION = "This package provides the Haskell typed-process library documentation."
LICENSE = "MIT"

PV = "0.2.11.0"

RPM_NAME = "ghc-typed-process-doc-0.2.11.0-1.6.noarch.rpm"
RPM_HASH = "b6c66a1eb75787b59fcb50cc699576d2366ab17f89d981d2577b6a0454ce329b80a234abd9029ae18829fc570ef887e9032ac27c2d81952a38fca90abde76ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-typed-process-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
