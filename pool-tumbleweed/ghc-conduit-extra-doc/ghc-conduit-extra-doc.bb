SUMMARY = "Haskell conduit-extra library documentation"
DESCRIPTION = "This package provides the Haskell conduit-extra library documentation."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "ghc-conduit-extra-doc-1.3.6-2.8.noarch.rpm"
RPM_HASH = "fb2fdc3325483f2389f6b4f618dca78e1da157fe13ea4f1d5573171e33e6995ce3bdb345e0690871a4ff177af1c2268d960dba7f0df53cbb713b8092b75e7b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-conduit-extra-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
