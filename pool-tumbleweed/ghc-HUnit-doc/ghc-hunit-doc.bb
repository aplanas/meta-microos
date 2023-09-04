SUMMARY = "Haskell HUnit library documentation"
DESCRIPTION = "This package provides the Haskell HUnit library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-doc-1.6.2.0-2.8.noarch.rpm"
RPM_HASH = "0c4347d5cf27acf5d12dba4b0d2df84dfa8d94d5c1c28cadcd5bf064715a3119daaa8f2f9bca9037c45816d64e2fb7075d7622093c1da458db15245170e2d329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-HUnit-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
