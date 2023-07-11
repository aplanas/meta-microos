SUMMARY = "Haskell adjunctions library documentation"
DESCRIPTION = "This package provides the Haskell adjunctions library documentation."
LICENSE = "BSD-2-Clause"

PV = "4.4.2"

RPM_NAME = "ghc-adjunctions-doc-4.4.2-2.6.noarch.rpm"
RPM_HASH = "05f19c9a84233d4e3df2bd347381f29a550308abfcf94680c34d9d82d3f50cee0d4f58ff8826f076f6bfacbb979de0ded02144abc3cbb925d70e5223e56298fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-adjunctions-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
