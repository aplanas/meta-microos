SUMMARY = "Haskell pem profiling library"
DESCRIPTION = "This package provides the Haskell pem profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "ghc-pem-prof-0.2.4-8.6.aarch64.rpm"
RPM_HASH = "8ea40eae59d190eb3c09bf87e78bad125427f92269a26f64326495f9b6c0d9b9b9cf1dc10dcc51f784ff17b1edd348eb5339c713099b5634e8ce998d9f0167c1"

RPROVIDES:${PN} += "ghc-pem-prof \
ghc-prof-pem-0.2.4-7ofxEvI1NwqKqDFtfJ1pS"

RDEPENDS:${PN} += "ghc-pem-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-basement-0.0.16-J8UFRjmsTYU7wBgfpjdWQn \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp"

inherit rpm
