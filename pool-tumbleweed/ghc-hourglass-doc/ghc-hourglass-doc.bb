SUMMARY = "Haskell hourglass library documentation"
DESCRIPTION = "This package provides the Haskell hourglass library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.2.12"

RPM_NAME = "ghc-hourglass-doc-0.2.12-7.8.noarch.rpm"
RPM_HASH = "7da9d66c740a9f5161605082bf97bf09d661546c8f112dad3fa110d2d09961f55ab071e774421e951b27586d6ac6380c8b190b246d29483f892873853e6e8dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hourglass-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
