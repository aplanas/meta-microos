SUMMARY = "Haskell http-client-tls library documentation"
DESCRIPTION = "This package provides the Haskell http-client-tls library documentation."
LICENSE = "MIT"

PV = "0.3.6.1"

RPM_NAME = "ghc-http-client-tls-doc-0.3.6.1-2.3.noarch.rpm"
RPM_HASH = "cc7418bc9942b024b3117ed8bba2c9bf002ec19b58b3350fb52a2cf6d1f6706b6044007001db1bd755d24c04075400eefa135ee2cbfe201a0696936f7ce31ef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-client-tls-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
