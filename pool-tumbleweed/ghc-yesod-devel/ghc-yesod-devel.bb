SUMMARY = "Haskell yesod library development files"
DESCRIPTION = "This package provides the Haskell yesod library development files."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-devel-1.6.2.1-2.9.aarch64.rpm"
RPM_HASH = "4a5a5b899388dd2fb7e8da5956f295742109da77b651d244585894423f240796dc2c227d130bf08f4544975a4197a1248acd4fa7672c7648a2b0487c520d114b"

RPROVIDES:${PN} += "ghc-devel-yesod-1.6.2.1-D8HbgYeltFYIG1lP9trVdf \
ghc-yesod-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-monad-logger-0.3.40-JON4xqa3KWj1ClCWFJbFYV \
ghc-devel-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-devel-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-extra-3.1.13.0-LFtqIngDY3AAQ1a5w3zKO8 \
ghc-devel-wai-logger-2.4.0-JuVFE6hpBhqDKHgP60Zmqn \
ghc-devel-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-devel-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-devel-yesod-core-1.6.24.2-7isfGP7hc9NLFaHQAgg8t \
ghc-devel-yesod-form-1.7.4-9SavUh7G36AKe86TvxSRtJ \
ghc-devel-yesod-persistent-1.6.0.8-Jui070TDUWhEJxvpNjmjRf \
ghc-yesod"

inherit rpm
