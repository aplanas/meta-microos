SUMMARY = "Haskell aeson-pretty profiling library"
DESCRIPTION = "This package provides the Haskell aeson-pretty profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.9"

RPM_NAME = "ghc-aeson-pretty-prof-0.8.9-4.2.aarch64.rpm"
RPM_HASH = "4df7f0f2a492931eea752e8fc65c21b060c1b7c9f005224a1af029e9e33172f9c7024f146102ac5a84a6ee01625a2b04138917bed0b77588f40d5f679a802302"

RPROVIDES:${PN} += "ghc-aeson-pretty-prof \
ghc-aeson-pretty-prof(aarch-64) \
ghc-prof(aeson-pretty-0.8.9-LUjG36DF6cc5sU1N5Uw0pr)"
RDEPENDS:${PN} += "ghc-aeson-pretty-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-prof(text-2.0.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
