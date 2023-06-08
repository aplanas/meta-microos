SUMMARY = "Haskell cprng-aes library development files"
DESCRIPTION = "This package provides the Haskell cprng-aes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-devel-0.6.1-4.2.aarch64.rpm"
RPM_HASH = "cd0b8600e69c1a0d722dbf7e22ca52eae4cd10692325ee053c9fb4150b50646f9607a9903cacf9cf456860f81d8d327890962d6f36a6185597d69ecd5325164a"

RPROVIDES:${PN} += "ghc-cprng-aes-devel ghc-cprng-aes-devel(aarch-64) ghc-devel(cprng-aes-0.6.1-169qys47NiB5UR1VcEjGCA)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-cprng-aes ghc-devel(base-4.17.1.0) ghc-devel(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) ghc-devel(bytestring-0.11.4.0) ghc-devel(cipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi) ghc-devel(crypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk)"

inherit rpm
