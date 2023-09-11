SUMMARY = "Haskell fdo-notify library documentation"
DESCRIPTION = "This package provides the Haskell fdo-notify library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "ghc-fdo-notify-doc-0.3.1-4.10.noarch.rpm"
RPM_HASH = "4eeb82ed405210fea8d9e80434f973066eb580302a76aa2f2d18bfb47227b643c602f904133f625746621c8b672d0c92470099ae36e2f975ca7ab18a4afed4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-fdo-notify-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
