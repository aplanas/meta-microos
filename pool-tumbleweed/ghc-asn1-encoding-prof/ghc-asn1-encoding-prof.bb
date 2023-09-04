SUMMARY = "Haskell asn1-encoding profiling library"
DESCRIPTION = "This package provides the Haskell asn1-encoding profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-prof-0.9.6-8.8.aarch64.rpm"
RPM_HASH = "dbd665797730197bac4de6bc6541bbc6f71b85eb664aff715eeb6a52fa2b85973db8d8f0ace29aa60406ee4a2162bba9ae5bbdb5d983ee3bd6b516140fce2a3a"

RPROVIDES:${PN} += "ghc-asn1-encoding-prof \
ghc-prof-asn1-encoding-0.9.6-G74cB7z1f0LBAKbqoDvYt6"

RDEPENDS:${PN} += "ghc-asn1-encoding-devel \
ghc-prof-asn1-types-0.3.4-7Qw76BNtuiJIUHv1x3z9in \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-hourglass-0.2.12-DDTIHdRSu369xxYEqSFzho"

inherit rpm
