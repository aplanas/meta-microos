SUMMARY = "Haskell hslua-aeson profiling library"
DESCRIPTION = "This package provides the Haskell hslua-aeson profiling library."
LICENSE = "MIT"

PV = "2.3.0.1"

RPM_NAME = "ghc-hslua-aeson-prof-2.3.0.1-1.2.aarch64.rpm"
RPM_HASH = "f8fada1b8bd27265937c965e33a41e06cbae387e5766d153ad248d4561078e40aeb7f97495c649227eac1cc20d4974ba5a61f3a794e31acf2622d6aded1f5485"

RPROVIDES:${PN} += "ghc-hslua-aeson-prof \
ghc-hslua-aeson-prof(aarch-64) \
ghc-prof(hslua-aeson-2.3.0.1-E4tasg1dFJ86CDrMHWRi4i)"
RDEPENDS:${PN} += "ghc-hslua-aeson-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(mtl-2.2.2) \
ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-prof(text-2.0.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
