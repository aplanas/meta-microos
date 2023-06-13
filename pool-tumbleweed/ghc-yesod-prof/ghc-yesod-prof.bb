SUMMARY = "Haskell yesod profiling library"
DESCRIPTION = "This package provides the Haskell yesod profiling library."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-prof-1.6.2.1-2.4.aarch64.rpm"
RPM_HASH = "a45071deac549240f1c87344c31492b49313eff07bc775993a1ada0c9227e75b6a6e19311cf02996550dbbe63da6f1d507389da0475a1e2a7e8725d3225d85af"

RPROVIDES:${PN} += "ghc-prof(yesod-1.6.2.1-9XR9lIPDy3fIxCuHXMwjcU) \
ghc-yesod-prof \
ghc-yesod-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-prof(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-prof(directory-1.3.7.1) \
ghc-prof(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-prof(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) \
ghc-prof(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) \
ghc-prof(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-prof(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(text-2.0.2) \
ghc-prof(unix-2.7.3) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-prof(wai-extra-3.1.13.0-B4Szpcpv4Gy5mM28jLfYmX) \
ghc-prof(wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0) \
ghc-prof(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) \
ghc-prof(yaml-0.11.11.0-AM27xwJeGq9DNHRH5iLzHi) \
ghc-prof(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) \
ghc-prof(yesod-form-1.7.4-4xvxNC76eVrIZVDOGDISYi) \
ghc-prof(yesod-persistent-1.6.0.8-DUd8QtbJfktGowTUT2pCEk) \
ghc-yesod-devel"

inherit rpm
