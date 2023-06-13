SUMMARY = "Haskell glib library documentation"
DESCRIPTION = "This package provides the Haskell glib library documentation."
LICENSE = "LGPL-2.1-only"

PV = "0.13.8.2"

RPM_NAME = "ghc-glib-doc-0.13.8.2-2.3.noarch.rpm"
RPM_HASH = "efa27104b5d2624e7606507f632e1fd09c43c8ad11c7921eeaa9bb6a002dde1b3cba9bd87ea6d8d7af210b3b0d99d6fb93a8c473af8669bf1a7fc407a775672d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-glib-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
