SUMMARY = "Haskell transformers library documentation"
DESCRIPTION = "This package provides the Haskell transformers library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.5.6.2"

RPM_NAME = "ghc-transformers-doc-0.5.6.2-3.2.noarch.rpm"
RPM_HASH = "bf3aa46a5bbde921bf47963fcfcc44392fb6c1fd1cba7938bc40d7f54b2f1682a1cc4d704f23970c7647cf410933ec212890983ad3355647136a8e9724d8d183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-transformers-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
