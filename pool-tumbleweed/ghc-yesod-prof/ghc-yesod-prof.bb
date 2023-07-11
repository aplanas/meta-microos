SUMMARY = "Haskell yesod profiling library"
DESCRIPTION = "This package provides the Haskell yesod profiling library."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-prof-1.6.2.1-2.7.aarch64.rpm"
RPM_HASH = "36156573cdf2c4663b56e5553d4496bb25b62eb90461556100ce4fb77571dbc1277325877a726c745c49f75708a73ee32386a6aee69bd23807a5b5c365b23931"

RPROVIDES:${PN} += "ghc-prof-yesod-1.6.2.1-3XUWyyFDZ8pGGoPItNc5wc \
ghc-yesod-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-directory-1.3.7.1 \
ghc-prof-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-monad-logger-0.3.40-G052AHl2mRW3aPPonmcvVW \
ghc-prof-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-extra-3.1.13.0-3pmfL93b8iXAmoBQvHdwGU \
ghc-prof-wai-logger-2.4.0-HFZNBDhfTBI6FWxvAW2OQE \
ghc-prof-warp-3.3.25-7qOcByHeVpuMAFF4vrupa \
ghc-prof-yaml-0.11.11.1-3T1xu4983kFHb1qERRZhqW \
ghc-prof-yesod-core-1.6.24.2-8wK3xEIlG3CBsmvalvvZaH \
ghc-prof-yesod-form-1.7.4-3XbqFtOs3TKAgriMSKjDj2 \
ghc-prof-yesod-persistent-1.6.0.8-FGWkxx7rXiRFDcm3y5XVcs \
ghc-yesod-devel"

inherit rpm
