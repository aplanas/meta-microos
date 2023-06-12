SUMMARY = "Haskell cprng-aes library documentation"
DESCRIPTION = "This package provides the Haskell cprng-aes library documentation."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-doc-0.6.1-4.2.noarch.rpm"
RPM_HASH = "22a8e15e516fa7ab872ba1a66e1757ce6a523015d5b50962d13c420f50d846dcbe52a3b4d61e4207c2bf37e182a027c0ade22897212e2f7cf609a9c8163e1994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghc-cprng-aes-doc"
RDEPENDS:${PN} += "ghc-filesystem"

inherit rpm
