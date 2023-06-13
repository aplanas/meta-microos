SUMMARY = "Haskell parallel library documentation"
DESCRIPTION = "This package provides the Haskell parallel library documentation."
LICENSE = "BSD-3-Clause"

PV = "3.2.2.0"

RPM_NAME = "ghc-parallel-doc-3.2.2.0-12.3.noarch.rpm"
RPM_HASH = "ef95aba3602d46e64a933c3e003ace86a329d14a573bc791d9e45678d8d04fc9105ddb63a2bd5e5809a6b05f76796139049ffbd944d22cbf458db80216b2de62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-parallel-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
