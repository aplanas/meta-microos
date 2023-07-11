SUMMARY = "Haskell HUnit library development files"
DESCRIPTION = "This package provides the Haskell HUnit library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.2.0"

RPM_NAME = "ghc-HUnit-devel-1.6.2.0-2.6.aarch64.rpm"
RPM_HASH = "3f2981958cc82432b14e51ddc153e32b2ad71e3a738ff79aa3763cd8c51c0d1fd71ea4df24137dd690bfdd4dc65bbfc452c403e9cd2d444197cb848a27919101"

RPROVIDES:${PN} += "ghc-HUnit-devel \
ghc-devel-HUnit-1.6.2.0-iqxwhcxJRu7EJOd1Mnwmb"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-HUnit \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-deepseq-1.4.8.0"

inherit rpm
