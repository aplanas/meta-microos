SUMMARY = "Haskell warp-tls library documentation"
DESCRIPTION = "This package provides the Haskell warp-tls library documentation."
LICENSE = "MIT"

PV = "3.3.6"

RPM_NAME = "ghc-warp-tls-doc-3.3.6-1.6.noarch.rpm"
RPM_HASH = "a0f67a3929423447505746934afc260e60c5b3f9d4197acaa4283711f57cce03b6af779058306017fd88666df8ab748861642b7e841c9cf290c1af85258f820a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-tls-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
