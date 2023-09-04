SUMMARY = "Haskell binary profiling library"
DESCRIPTION = "This package provides the Haskell binary profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9.1"

RPM_NAME = "ghc-binary-prof-0.8.9.1-1.1.aarch64.rpm"
RPM_HASH = "a6b64c61497f4995c6389eea79c782c084739ca83aff754b9016ff09c63f18baf692e3dc24129b547672b6de7aaa38259b20d30a97f688e58a76260f4277b064"

RPROVIDES:${PN} += "ghc-binary-prof \
ghc-prof-binary-0.8.9.1"

RDEPENDS:${PN} += "ghc-binary-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7"

inherit rpm
