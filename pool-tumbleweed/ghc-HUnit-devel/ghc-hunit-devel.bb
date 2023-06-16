SUMMARY = "Haskell HUnit library development files"
DESCRIPTION = "This package provides the Haskell HUnit library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-devel-1.6.2.0-2.3.aarch64.rpm"
RPM_HASH = "7229d42e731a8fe72dd2dc5f1b6e0940ef072c72ce8e4e55cdff39ebb1fac5ce5f014131d86e49a65afeb019035d9578661e4b2bed024d496863cc04a18717e2"

RPROVIDES:${PN} += "ghc-HUnit-devel \
ghc-devel-HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HUnit \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
