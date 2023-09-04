SUMMARY = "Haskell hslua-repl library documentation"
DESCRIPTION = "This package provides the Haskell hslua-repl library documentation."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ghc-hslua-repl-doc-0.1.1-1.3.noarch.rpm"
RPM_HASH = "6ab231a047b4e24f8a617bdc87fa854acba527e34c63b90f5dc1530660426d581d19671cf08bcd1956a2fe03902b5aaa46a73b586e927d9f64f623a23d911942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-repl-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
