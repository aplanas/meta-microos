SUMMARY = "Haskell config-ini library documentation"
DESCRIPTION = "This package provides the Haskell config-ini library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.6.0"

RPM_NAME = "ghc-config-ini-doc-0.2.6.0-1.2.noarch.rpm"
RPM_HASH = "20054ca37438d8d3884bf157d4bf2b2968a76d90f1b11813f7e9aac531fb71c7aadad8d51417b09cea231db60f4f6a0cbff0f93e4cb62545efc2766bd6c1fb27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-config-ini-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
