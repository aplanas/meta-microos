SUMMARY = "Haskell http-date profiling library"
DESCRIPTION = "This package provides the Haskell http-date profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.11"

RPM_NAME = "ghc-http-date-prof-0.0.11-2.9.aarch64.rpm"
RPM_HASH = "e5222572d76a19ea1a57ac0b886db53044c8b172229c74756401c58e539f0f27a0bcd2b10cbf5b493d9bcf1cd5a2a7c18813e732889b4df600ed7f74a1830d18"

RPROVIDES:${PN} += "ghc-http-date-prof \
ghc-prof-http-date-0.0.11-HoNgmNPQQe1ErFjujEoPyv"

RDEPENDS:${PN} += "ghc-http-date-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-time-1.12.2"

inherit rpm
