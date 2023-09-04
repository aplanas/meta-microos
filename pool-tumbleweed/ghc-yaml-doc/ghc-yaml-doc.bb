SUMMARY = "Haskell yaml library documentation"
DESCRIPTION = "This package provides the Haskell yaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-doc-0.11.11.2-1.5.noarch.rpm"
RPM_HASH = "f02b9d3485b02eccdc2a2781c3c1c920df0d0de4fb1de598064a3d39bc4bdfb254f7738b7622a2a6d35dee47b902182eed4c5d0a4781011e23e4729c1ada684c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
