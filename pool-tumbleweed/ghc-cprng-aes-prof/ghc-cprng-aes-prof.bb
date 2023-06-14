SUMMARY = "Haskell cprng-aes profiling library"
DESCRIPTION = "This package provides the Haskell cprng-aes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "ghc-cprng-aes-prof-0.6.1-4.2.aarch64.rpm"
RPM_HASH = "1c84cfef5f5a637255bddf677b358c4be8aff91a5d494b3e20664a3262171912b69ce049bb3bb26731b32412e92c2c22893101363c5cbd4da2bef5ef72ff28e1"

RPROVIDES:${PN} += "ghc-cprng-aes-prof \
ghc-prof-cprng-aes-0.6.1-169qys47NiB5UR1VcEjGCA"

RDEPENDS:${PN} += "ghc-cprng-aes-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi \
ghc-prof-crypto-random-0.0.9-JRbP8k0BmeXEHkvOdlpIfk"

inherit rpm
