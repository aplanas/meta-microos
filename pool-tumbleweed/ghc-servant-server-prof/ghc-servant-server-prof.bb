SUMMARY = "Haskell servant-server profiling library"
DESCRIPTION = "This package provides the Haskell servant-server profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-prof-0.19.2-2.4.aarch64.rpm"
RPM_HASH = "209850b19168ee15dbb41a13757bf2f1f266278a345d7d5011032a1917dd416ecfe2c336b2b19f498746d386bd57f929d8ce1b87b66adc0f9a2b446e625bca18"

RPROVIDES:${PN} += "ghc-prof-servant-server-0.19.2-JqERhBhwGZn1ju7NrrjU2W \
ghc-servant-server-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov \
ghc-prof-base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-constraints-0.13.4-8c0InBhz3htJzug27IqVE7 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-http-api-data-0.5-Ipkpz3wcjEIJthDto7snfd \
ghc-prof-http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-servant-0.19.1-CkczWd9pQYqHxItHfQRhzE \
ghc-prof-sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe \
ghc-prof-string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx \
ghc-prof-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp \
ghc-prof-wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn \
ghc-prof-wai-app-static-3.1.7.4-9UpsDZD9lQf3J0Cj3szLw2 \
ghc-prof-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-servant-server-devel"

inherit rpm
