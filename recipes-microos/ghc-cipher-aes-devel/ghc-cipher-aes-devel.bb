SUMMARY = "Haskell cipher-aes library development files"
DESCRIPTION = "This package provides the Haskell cipher-aes library development files."
LICENSE = "BSD-3-Clause"

PV = "0.2.11"

RPM_NAME = "ghc-cipher-aes-devel-0.2.11-4.2.aarch64.rpm"
RPM_HASH = "96b2d1a00886fa67d475e46ca58f50617085df41325d1824c6e5b7e19e8715a4c2a4047c6ead71bb68edfa9c5de00cf80c518c5209b374b517baaafbf9692a22"

RPROVIDES:${PN} += "ghc-cipher-aes-devel \
ghc-cipher-aes-devel(aarch-64) \
ghc-devel(cipher-aes-0.2.11-Izmj38K7uNp7rHcFTtfQFi)"
RDEPENDS:${PN} += "/bin/sh \
ghc-cipher-aes \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(byteable-0.1.1-KSaZugJOm4ALb4WyX9cufg) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(crypto-cipher-types-0.0.9-4A4LPNV9DwQ1VQ3vwUnE52) \
ghc-devel(securemem-0.1.10-BbcWu3otOS6JQaPW3JfszZ)"

inherit rpm
