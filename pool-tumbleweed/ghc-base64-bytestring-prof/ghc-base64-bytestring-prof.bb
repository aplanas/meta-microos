SUMMARY = "Haskell base64-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base64-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-prof-1.2.1.0-2.3.aarch64.rpm"
RPM_HASH = "4cfd72408bf4c6575dfb3a8b321e54f68e62f6532b8e7d7db6c93411ec93eb75b18af7b13c254fbf04861102611df0e9f6e99b637a317e2edfbb5686fab69350"

RPROVIDES:${PN} += "ghc-base64-bytestring-prof \
ghc-base64-bytestring-prof(aarch-64) \
ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh)"

RDEPENDS:${PN} += "ghc-base64-bytestring-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
