SUMMARY = "Haskell text-short library documentation"
DESCRIPTION = "This package provides the Haskell text-short library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "ghc-text-short-doc-0.1.5-3.6.noarch.rpm"
RPM_HASH = "874d6c09235a39405cb44d010fd40d738867fd572e59db1f917beab28b4463538b71a7ec725f5e7f854a26a8f7b0aefd9a05e3b7057fffb903d8f8ad507bb6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-text-short-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
