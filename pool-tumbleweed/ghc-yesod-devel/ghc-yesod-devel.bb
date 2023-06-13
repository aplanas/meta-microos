SUMMARY = "Haskell yesod library development files"
DESCRIPTION = "This package provides the Haskell yesod library development files."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-devel-1.6.2.1-2.4.aarch64.rpm"
RPM_HASH = "4ed5b600cc0d06fd73600e3889c9b195e4e0d9fa9d2f2ac90e7dd90ff9890025482055f4d6abeb0f5cccb9d13f7db3713fdfafeb6e4025f15c20f6226770fe99"

RPROVIDES:${PN} += "ghc-devel(yesod-1.6.2.1-9XR9lIPDy3fIxCuHXMwjcU) \
ghc-yesod-devel \
ghc-yesod-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-devel(file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw) \
ghc-devel(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) \
ghc-devel(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-devel(streaming-commons-0.2.2.6-DrPeIbd2d2c3jQtctttO4G) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(unix-2.7.3) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) \
ghc-devel(wai-extra-3.1.13.0-B4Szpcpv4Gy5mM28jLfYmX) \
ghc-devel(wai-logger-2.4.0-9XzUYLocOmA4DcbxilrxA0) \
ghc-devel(warp-3.3.25-E7dqXF5eh0k5u5fIPKRjLZ) \
ghc-devel(yaml-0.11.11.0-AM27xwJeGq9DNHRH5iLzHi) \
ghc-devel(yesod-core-1.6.24.2-DExtrbWuaUvstmq3VZuwG) \
ghc-devel(yesod-form-1.7.4-4xvxNC76eVrIZVDOGDISYi) \
ghc-devel(yesod-persistent-1.6.0.8-DUd8QtbJfktGowTUT2pCEk) \
ghc-yesod"

inherit rpm
