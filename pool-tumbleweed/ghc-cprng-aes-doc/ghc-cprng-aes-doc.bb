SUMMARY = "Haskell cprng-aes library documentation"
DESCRIPTION = "This package provides the Haskell cprng-aes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-doc-0.6.1-4.3.noarch.rpm"
RPM_HASH = "c8a9c2c2caab0d815511d2938468d3da84dbf2b51066b703a374b0e9aee3636b1818fbda3e95294f31f8ae491f22fed21c75418da0a6ce38346b6fe85f10af30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cprng-aes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
