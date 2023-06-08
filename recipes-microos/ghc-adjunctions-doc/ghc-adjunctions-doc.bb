SUMMARY = "Haskell adjunctions library documentation"
DESCRIPTION = "This package provides the Haskell adjunctions library documentation."
LICENSE = "BSD-2-Clause"

PV = "4.4.2"

RPM_NAME = "ghc-adjunctions-doc-4.4.2-2.3.noarch.rpm"
RPM_HASH = "1686aa952c81c3b6aee27d0a1e4b2e3436aa2b26023e984bb1048451e9f04061b6c137d518bc23c383db724eb525e098a11986fe1fcb1f247eb1a15ee70417ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-adjunctions-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
