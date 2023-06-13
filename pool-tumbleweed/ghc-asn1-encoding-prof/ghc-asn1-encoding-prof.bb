SUMMARY = "Haskell asn1-encoding profiling library"
DESCRIPTION = "This package provides the Haskell asn1-encoding profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "ghc-asn1-encoding-prof-0.9.6-8.3.aarch64.rpm"
RPM_HASH = "e039871cf172293a33f973351edba6627076e8d44718288798fed0eba6f1660354755d07f061b52d88b68041fda4d7c2663d7ee10f1c059acad137f1a827d3e6"

RPROVIDES:${PN} += "ghc-asn1-encoding-prof \
ghc-asn1-encoding-prof(aarch-64) \
ghc-prof(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk)"

RDEPENDS:${PN} += "ghc-asn1-encoding-devel \
ghc-prof(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(hourglass-0.2.12-3PFbUFQLMNb8Ad2s9SU5p3)"

inherit rpm
