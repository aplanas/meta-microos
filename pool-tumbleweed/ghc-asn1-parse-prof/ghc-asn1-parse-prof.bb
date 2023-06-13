SUMMARY = "Haskell asn1-parse profiling library"
DESCRIPTION = "This package provides the Haskell asn1-parse profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "ghc-asn1-parse-prof-0.9.5-6.2.aarch64.rpm"
RPM_HASH = "8ff11ad77d0f70d7576969732aa004e38b133a34dd7d36630343d3cc99c16ce83a22e3ce1494ff9ad31abd9814c090aa96917e0309ddef1c3b4b0e8ab2072901"

RPROVIDES:${PN} += "ghc-asn1-parse-prof \
ghc-asn1-parse-prof(aarch-64) \
ghc-prof(asn1-parse-0.9.5-EPDirjvv9Ch16KeQVAexUV)"

RDEPENDS:${PN} += "ghc-asn1-parse-devel \
ghc-prof(asn1-encoding-0.9.6-Hputs8NTOGr9EmEd7QDXHk) \
ghc-prof(asn1-types-0.3.4-GYlFjiH4jmgJII5TgUQfXm) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
