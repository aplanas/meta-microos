SUMMARY = "Haskell asn1-parse profiling library"
DESCRIPTION = "This package provides the Haskell asn1-parse profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-prof-0.9.5-6.4.aarch64.rpm"
RPM_HASH = "d4551a60eadd54d71db6eef2fb8e24bf274c2d7e37f73a6fba43fa99f88749067841965cf6fe182e7b8a79ce2b660ffd0b0c76c5f4884db71324f004c1d24015"

RPROVIDES:${PN} += "ghc-asn1-parse-prof \
ghc-prof-asn1-parse-0.9.5-BHBxQSMDAmU3iO1lXgL9KG"

RDEPENDS:${PN} += "ghc-asn1-parse-devel \
ghc-prof-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6 \
ghc-prof-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
