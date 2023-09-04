SUMMARY = "Haskell http-date library documentation"
DESCRIPTION = "This package provides the Haskell http-date library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-doc-0.0.11-2.9.noarch.rpm"
RPM_HASH = "4c0ba345f31334b4b33c094541461b8f0de092d7694462f1a1a1ef5ed5c1ac3032d1cc1a2e85c939be86a20edcd1644866a92854c7e3618bdd9a78721885122f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-http-date-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
