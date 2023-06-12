SUMMARY = "Haskell base16-bytestring profiling library"
DESCRIPTION = "This package provides the Haskell base16-bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.0"

RPM_NAME = "ghc-base16-bytestring-prof-1.0.2.0-2.2.aarch64.rpm"
RPM_HASH = "622583e532c7c0bda59848f2e03f331f0ef09d4dc3a092b103bec9dd82f5de74c7508ca17ef4e777db4f9b457e9d1a16b163e5ed3f24f454fe9ad3f535b34569"

RPROVIDES:${PN} += "ghc-base16-bytestring-prof \
ghc-base16-bytestring-prof(aarch-64) \
ghc-prof(base16-bytestring-1.0.2.0-BWBHxp15W1kvZUUcQHZQU)"
RDEPENDS:${PN} += "ghc-base16-bytestring-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0)"

inherit rpm
