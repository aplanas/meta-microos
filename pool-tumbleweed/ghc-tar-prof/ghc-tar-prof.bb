SUMMARY = "Haskell tar profiling library"
DESCRIPTION = "This package provides the Haskell tar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-prof-0.5.1.1-11.6.aarch64.rpm"
RPM_HASH = "788e4d246a36b76df53ac599bb3db816bc6340c6c6983f37a961d89905250d1e64e6a95d1f2516b501e4ea59915b864c65e5f6cce30985c45798747969f50d51"

RPROVIDES:${PN} += "ghc-prof-tar-0.5.1.1-Dtsl5am3zST5LscMXaDdU8 \
ghc-tar-prof"

RDEPENDS:${PN} += "ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2 \
ghc-tar-devel"

inherit rpm
