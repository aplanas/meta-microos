SUMMARY = "Haskell yaml library documentation"
DESCRIPTION = "This package provides the Haskell yaml library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-doc-0.11.11.2-1.1.noarch.rpm"
RPM_HASH = "9fcce4bbaa7b8859c813ced2b5044397c6061ce7ae68dc441e75b4ce31a656c4c20173fbfab736877fa66a686725332f43a0971449f4d63d42aeca0a1f45213a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-yaml-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
