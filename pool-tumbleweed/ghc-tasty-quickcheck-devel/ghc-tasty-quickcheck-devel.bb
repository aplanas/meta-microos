SUMMARY = "Haskell tasty-quickcheck library development files"
DESCRIPTION = "This package provides the Haskell tasty-quickcheck library development \
files."
LICENSE = "MIT"

PV = "0.10.2"

RPM_NAME = "ghc-tasty-quickcheck-devel-0.10.2-2.2.aarch64.rpm"
RPM_HASH = "9e6dc33235e4b1fdcf146a9e77af660d55430f086099da80854ce2b3e88fb163fa4147e783327b0456c4d1d96cedfd4304f2f4b40ea876db747108b13d83ea57"

RPROVIDES:${PN} += "ghc-devel(tasty-quickcheck-0.10.2-35bOuuNPLunDPSjWY1CT1e) \
ghc-tasty-quickcheck-devel \
ghc-tasty-quickcheck-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(QuickCheck-2.14.2-Ifslnzw9cpLJMSBGXVUlx6) \
ghc-devel(base-4.17.1.0) \
ghc-devel(optparse-applicative-0.17.0.0-FKlMMFcKpwNJEuIq63gWOB) \
ghc-devel(random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o) \
ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-devel(tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz) \
ghc-tasty-quickcheck"

inherit rpm
