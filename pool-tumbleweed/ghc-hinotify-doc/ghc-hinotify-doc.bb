SUMMARY = "Haskell hinotify library documentation"
DESCRIPTION = "This package provides the Haskell hinotify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-doc-0.4.1-3.2.noarch.rpm"
RPM_HASH = "3f0e926636e7948feb2c924869000b250731946e56393d5384af397e16127ba3750a41dca6306862fabef6fe6d3a9a6e53e830f7bf4eb903b7d90bc33d2c9a85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-hinotify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
