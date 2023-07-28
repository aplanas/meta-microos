SUMMARY = "Haskell cprng-aes library documentation"
DESCRIPTION = "This package provides the Haskell cprng-aes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-doc-0.6.1-5.1.noarch.rpm"
RPM_HASH = "b437a28cb9dabb6726d0590d2188872fda417c2f2434daf80aee4eafd2d9228a29dd5808349822cd7fb47d38becfe26248e3f6493bd681ddb8e5d0f0087e6c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cprng-aes-doc"

RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
