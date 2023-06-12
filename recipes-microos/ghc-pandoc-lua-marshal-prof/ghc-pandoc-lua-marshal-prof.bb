SUMMARY = "Haskell pandoc-lua-marshal profiling library"
DESCRIPTION = "This package provides the Haskell pandoc-lua-marshal profiling library."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "ghc-pandoc-lua-marshal-prof-0.2.2-1.4.aarch64.rpm"
RPM_HASH = "e2c34a09931ab4c9861c10b68ed0e1b1e7c77f995b3dcae6ecefa297d752426090b7d50d1d15831706a7e13541ac687d83c60009f714c9c565912764c023e5ca"

RPROVIDES:${PN} += "ghc-pandoc-lua-marshal-prof \
ghc-pandoc-lua-marshal-prof(aarch-64) \
ghc-prof(pandoc-lua-marshal-0.2.2-2fE4OFaoKDIH7Xx6aGVXCP)"
RDEPENDS:${PN} += "ghc-pandoc-lua-marshal-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(hslua-2.3.0-1soYqkTydt2HAPmAXqHREY) \
ghc-prof(hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(lua-2.3.1-16mGxirchUh4T3oJJYdFzu) \
ghc-prof(pandoc-types-1.23-EFziwPO22I72D2SxHphq63) \
ghc-prof(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-prof(text-2.0.2)"

inherit rpm
