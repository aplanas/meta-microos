SUMMARY = "Haskell file-embed library documentation"
DESCRIPTION = "This package provides the Haskell file-embed library documentation."
LICENSE = "BSD-2-Clause"

PV = "0.0.15.0"

RPM_NAME = "ghc-file-embed-doc-0.0.15.0-2.3.noarch.rpm"
RPM_HASH = "c79cd62144a2fbf7586d12263f24e80c95e97ca3aaf7e97b12f60c67c0735b1a0e668f9ffb738364988e53127e96d159c9322c980633a4e19edd2fd196fa0f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-file-embed-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
