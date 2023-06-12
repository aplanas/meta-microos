SUMMARY = "Haskell random library documentation"
DESCRIPTION = "This package provides the Haskell random library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.1"

RPM_NAME = "ghc-random-doc-1.2.1.1-2.2.noarch.rpm"
RPM_HASH = "4a765113de8574e3ad3fa17d05b3acb04b5a54f50a3a7493cb904417484973fa407514f45f0439c7f9d4b21781a8dd4c318612b401c494379684fa233d7759c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-random-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
