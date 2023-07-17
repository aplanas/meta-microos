SUMMARY = "Haskell warp library documentation"
DESCRIPTION = "This package provides the Haskell warp library documentation."
LICENSE = "MIT"

PV = "3.3.25"

RPM_NAME = "ghc-warp-doc-3.3.25-1.9.noarch.rpm"
RPM_HASH = "0dd9c7843823acbd1cb021969ef67ff6fdfdd754d08c90c6a777492ef5c20faca647a95a7da0b871c0fbb8192c0ba5850f668fcde6981478906c1f1b7c7e99f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-warp-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
