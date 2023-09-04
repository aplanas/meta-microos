SUMMARY = "Haskell base64-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base64-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1.0"

RPM_NAME = "ghc-base64-bytestring-prof-1.2.1.0-3.3.aarch64.rpm"
RPM_HASH = "1f4603990b0b3c037d2ed3f77476c66eab7cad4225f5843c8012e48c2c61bf4afb3445f4062732ca5a4e764cb739a6b6549627590aa60b9ab2e374c258d761cf"

RPROVIDES:${PN} += "ghc-base64-bytestring-prof \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM"

RDEPENDS:${PN} += "ghc-base64-bytestring-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
