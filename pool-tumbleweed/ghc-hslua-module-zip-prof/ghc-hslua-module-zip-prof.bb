SUMMARY = "Haskell hslua-module-zip profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-zip profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-zip-prof-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "96afa754f796f56237536672433dca7cd312e4c997ff38900fb6ee20ff03da45d685aaab8d3b83153c75de28bc7db3d1bf1e1d88c6b264f46806a21c6a3c99af"

RPROVIDES:${PN} += "ghc-hslua-module-zip-prof \
ghc-hslua-module-zip-prof(aarch-64) \
ghc-prof(hslua-module-zip-1.1.0-HbdBiDu9SYHDsbypcn78hx)"

RDEPENDS:${PN} += "ghc-hslua-module-zip-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-prof(hslua-list-1.1.1-9l63Ku7u96Z6i2wKz0R57A) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-prof(hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj) \
ghc-prof(text-2.0.2) \
ghc-prof(time-1.12.2) \
ghc-prof(zip-archive-0.4.3-DcfDtoW5uCpFhVU7PDyRvn)"

inherit rpm
