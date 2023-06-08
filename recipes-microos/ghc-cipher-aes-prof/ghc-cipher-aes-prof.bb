SUMMARY = "Haskell cipher-aes profiling library"
DESCRIPTION = "This package provides the Haskell cipher-aes profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-prof-0.2.11-4.2.aarch64.rpm"
RPM_HASH = "e4d068df9e3060b47d7e998c6e55087c4a1b682a2d620ab89418701855469c03385544d2e28c4b519ea81c6c22f65f998e58df8e4967ec88ef610a87d577a417"

RPROVIDES:${PN} += "ghc-cipher-aes-prof ghc-cipher-aes-prof(aarch-64) ghc-prof(cipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi)"
RDEPENDS:${PN} += "ghc-cipher-aes-devel ghc-prof(base-4.17.1.0) ghc-prof(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) ghc-prof(bytestring-0.11.4.0) ghc-prof(crypto-cipher-types-0.0.9-4A4LPNV9DwQ1VQ3vwUnE52) ghc-prof(securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ)"

inherit rpm
