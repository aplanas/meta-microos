SUMMARY = "Haskell wai-extra library documentation"
DESCRIPTION = "This package provides the Haskell wai-extra library documentation."
LICENSE = "MIT"

PV = "3.1.13.0"

RPM_NAME = "ghc-wai-extra-doc-3.1.13.0-2.13.noarch.rpm"
RPM_HASH = "ad16e9fa0a21077d8e47e8a3810ae12ec35a2f3144f2583cc8ab2ca398d38610a634ec4083ab838512224827f5a8b8d99a5c1781a1a8acbabdc48ea2026a1682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-wai-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
