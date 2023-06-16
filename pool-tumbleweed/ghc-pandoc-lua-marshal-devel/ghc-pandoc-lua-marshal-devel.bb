SUMMARY = "Haskell pandoc-lua-marshal library development files"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal library development \
files."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-devel-0.2.2-1.4.aarch64.rpm"
RPM_HASH = "3c3bd08675d57a4494ff7813abfc89b63a3489c031c99e3b0c4dcf822978e2cbaf6893a0eb5c8d2a7af723877cb893b21e1d54eecc2821ace8d231059698ea49"

RPROVIDES:${PN} += "ghc-devel-pandoc-lua-marshal-0.2.2-2fE4OFaoKDIH7Xx6aGVXCP \
ghc-pandoc-lua-marshal-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-2.3.0-1soYqkTydt2HAPmAXqHREY \
ghc-devel-hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A \
ghc-devel-hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq \
ghc-devel-lua-2.3.1-16mGxirchUh4T3oJJYdFzu \
ghc-devel-pandoc-types-1.23-EFziwPO22I72D2SxHphq63 \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-text-2.0.2 \
ghc-pandoc-lua-marshal"

inherit rpm
