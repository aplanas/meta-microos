SUMMARY = "Haskell unix-compat library documentation"
DESCRIPTION = "This package provides the Haskell unix-compat library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-doc-0.6-3.3.noarch.rpm"
RPM_HASH = "9203a1d721d40444a7b8dba3a1ac6381c7e6d66f5cdc5c564920542d775671d76332ad5d506d9aef42732552ad18975cb4e741407e9f40d96ed7337b89f66b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-unix-compat-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
