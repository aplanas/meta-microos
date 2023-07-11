SUMMARY = "Haskell network-info profiling library"
DESCRIPTION = "This package provides the Haskell network-info profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-network-info-prof-0.2.1-2.3.aarch64.rpm"
RPM_HASH = "bd0338303e8e7f909a8e65d8fbbf902df3843b4e38fbab1d5f3ca7847b474498fd82ac586a7e3a2171f90e457c2437ca7f2ceba1bae407fb0b4be020a57d755e"

RPROVIDES:${PN} += "ghc-network-info-prof \
ghc-prof-network-info-0.2.1-G9nMDkAKQecAEHIupCmq9I"

RDEPENDS:${PN} += "ghc-network-info-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
