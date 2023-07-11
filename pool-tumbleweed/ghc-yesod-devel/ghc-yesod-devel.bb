SUMMARY = "Haskell yesod library development files"
DESCRIPTION = "This package provides the Haskell yesod library development files."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-devel-1.6.2.1-2.7.aarch64.rpm"
RPM_HASH = "85d382f00e669d594acd4183553266394dd5f1e5b090b60a5a18e74829162bd51d7073bc7b469436753eb3124c3ba483aa91bc5fffd593a269a58f1b1fbbd6a1"

RPROVIDES:${PN} += "ghc-devel-yesod-1.6.2.1-3XUWyyFDZ8pGGoPItNc5wc \
ghc-yesod-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-monad-logger-0.3.40-G052AHl2mRW3aPPonmcvVW \
ghc-devel-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-extra-3.1.13.0-3pmfL93b8iXAmoBQvHdwGU \
ghc-devel-wai-logger-2.4.0-HFZNBDhfTBI6FWxvAW2OQE \
ghc-devel-warp-3.3.25-7qOcByHeVpuMAFF4vrupa \
ghc-devel-yaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW \
ghc-devel-yesod-core-1.6.24.2-8wK3xEIlG3CBsmvalvvZaH \
ghc-devel-yesod-form-1.7.4-3XbqFtOs3TKAgriMSKjDj2 \
ghc-devel-yesod-persistent-1.6.0.8-FGWkxx7rXiRFDcm3y5XVcs \
ghc-yesod"

inherit rpm
