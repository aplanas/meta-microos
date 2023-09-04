SUMMARY = "Haskell skylighting library documentation"
DESCRIPTION = "This package provides the Haskell skylighting library documentation."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.4.1"

RPM_NAME = "ghc-skylighting-doc-0.13.4.1-1.5.noarch.rpm"
RPM_HASH = "43f8bff7ddda7ae3ad5e14588792b5021920e848abc278f8665f980ae635dca3d26eb3182a9798720e76003395e3587558cb286a6284494b071eca8be5e17ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-skylighting-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
