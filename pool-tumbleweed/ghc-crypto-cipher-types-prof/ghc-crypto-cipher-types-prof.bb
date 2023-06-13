SUMMARY = "Haskell crypto-cipher-types profiling library"
DESCRIPTION = "This package provides the Haskell crypto-cipher-types profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.0.9"

RPM_NAME = "ghc-crypto-cipher-types-prof-0.0.9-4.3.aarch64.rpm"
RPM_HASH = "ac339a6fe39ddd40b079e184516513e174ae59f0507872c03f3b2383acf1ffb27d50bfac299add3c09a6ce7d0f23dd10b8b8843f6f441827bdcccf52786a43dd"

RPROVIDES:${PN} += "ghc-crypto-cipher-types-prof \
ghc-crypto-cipher-types-prof(aarch-64) \
ghc-prof(crypto-cipher-types-0.0.9-4A4LPNV9DwQ1VQ3vwUnE52)"

RDEPENDS:${PN} += "ghc-crypto-cipher-types-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ)"

inherit rpm
