SUMMARY = "Haskell async library documentation"
DESCRIPTION = "This package provides the Haskell async library documentation."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "ghc-async-doc-2.2.4-4.2.noarch.rpm"
RPM_HASH = "af10bff734acccadd524fa8133a0572ae780ed638a6b0685e74a27a802ec1575433c0e018f16ff9aa59380120114a5ce3542016e91d81aacfe6e03b885dd1eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-async-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
