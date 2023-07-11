SUMMARY = "Haskell mountpoints library documentation"
DESCRIPTION = "This package provides the Haskell mountpoints library documentation."
LICENSE = "LGPL-2.1-or-later & BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-mountpoints-doc-1.0.2-4.3.noarch.rpm"
RPM_HASH = "8d104410ae3c5daf4fbf95945c7e37b8ab90f0e4ffd8494380c2da77aa9dadf3b4e4011e5098f1924bfb4d396aa9e53f7e65cfccdf519deca3cb87fba85f151a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-mountpoints-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
