SUMMARY = "Haskell binary library documentation"
DESCRIPTION = "This package provides the Haskell binary library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-doc-0.8.9.1-3.2.noarch.rpm"
RPM_HASH = "86590df540f7b09e26af477b0330fb3106c117b270b99ceb281976a07c58cd6d24aa85ad17671383afe16dd509ab9f949164908c0143d68365a3092489cb2a21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-binary-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
