SUMMARY = "Haskell hslua-cli library documentation"
DESCRIPTION = "This package provides the Haskell hslua-cli library documentation."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ghc-hslua-cli-doc-1.4.1-1.3.noarch.rpm"
RPM_HASH = "511fa9fd5822304b86a79c99581e4b83b7b2b6bd0bab7d5c5218bf8c3cc23a8ff32c5454ceae38fc922dd1de97a0dba2e466bcfe104e0dcda5636f4c34d96f10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hslua-cli-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
