SUMMARY = "Haskell citeproc library documentation"
DESCRIPTION = "This package provides the Haskell citeproc library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-doc-0.8.1-2.4.noarch.rpm"
RPM_HASH = "588406c56d16817c621df37ac20d079da4ac552d1cf0f045bcec09dfda4d1f6e96e56ab1454e484acbac766c4ae0b4daa735b5315a3ec07bcc27165e22171489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-citeproc-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
