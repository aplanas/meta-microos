SUMMARY = "Haskell x509 library documentation"
DESCRIPTION = "This package provides the Haskell x509 library documentation."
LICENSE = "BSD-3-Clause"

PV = "1.7.7"

RPM_NAME = "ghc-x509-doc-1.7.7-2.8.noarch.rpm"
RPM_HASH = "62d97f99aea3286622af2bfdd449e5c3586ce4be65788922774399363ec35bfa5771c08689e979bcbff60fd79fff217e3a743e06e6364001bc0f5630087689f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-x509-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
