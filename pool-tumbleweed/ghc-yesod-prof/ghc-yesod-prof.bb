SUMMARY = "Haskell yesod profiling library"
DESCRIPTION = "This package provides the Haskell yesod profiling library."
LICENSE = "MIT"

PV = "1.6.2.1"

RPM_NAME = "ghc-yesod-prof-1.6.2.1-2.11.aarch64.rpm"
RPM_HASH = "d455df913dd836bc6b08034d21a87aeaed62a9abf3342890ef8b2454e67999f606463a05a7c8254673540dc3c71c7760c77eedb9fd7f76ae1ebbcff4033966dd"

RPROVIDES:${PN} += "ghc-prof-yesod-1.6.2.1-GnVZ7sz1eQh1lEH2dI3IH7 \
ghc-yesod-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-data-default-class-0.1.2.0-2LD1I8dZmn7BW4dkzEwdGZ \
ghc-prof-directory-1.3.7.1 \
ghc-prof-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-monad-logger-0.3.40-JON4xqa3KWj1ClCWFJbFYV \
ghc-prof-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-prof-streaming-commons-0.2.2.6-EjKcoRCMdUH4DbzWvGfVlu \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-extra-3.1.13.0-LFtqIngDY3AAQ1a5w3zKO8 \
ghc-prof-wai-logger-2.4.0-JuVFE6hpBhqDKHgP60Zmqn \
ghc-prof-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-prof-yaml-0.11.11.2-4GYYolDKkXn5x4zdb9DA59 \
ghc-prof-yesod-core-1.6.24.3-FuwsWoOUEyTCufqnix4g5P \
ghc-prof-yesod-form-1.7.4-A4NJLliFfnZ1tqLIO9QkD9 \
ghc-prof-yesod-persistent-1.6.0.8-A587fdCgueU2UmsZUmFzaX \
ghc-yesod-devel"

inherit rpm
