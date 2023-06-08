SUMMARY = "Haskell servant-server library development files"
DESCRIPTION = "This package provides the Haskell servant-server library development files."
LICENSE = "BSD-3-Clause"

PV = "0.19.2"

RPM_NAME = "ghc-servant-server-devel-0.19.2-2.4.aarch64.rpm"
RPM_HASH = "3efbce5fe94f5a203eae6b68261a000d2f787f970883e1bd58f4e4ed2c1e930ea5e4886e7864d59e52cf734ef8a06c817fa8d5eaacee2d320c0eb6c6e3395365"

RPROVIDES:${PN} += "ghc-devel(servant-server-0.19.2-JqERhBhwGZn1ju7NrrjU2W) ghc-servant-server-devel ghc-servant-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(base-compat-0.12.2-L1DEOlMQJOdFOKsjHoWYov) ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) ghc-devel(bytestring-0.11.4.0) ghc-devel(constraints-0.13.4-8c0InBhz3htJzug27IqVE7) ghc-devel(containers-0.6.7) ghc-devel(exceptions-0.10.5) ghc-devel(filepath-1.4.2.2) ghc-devel(http-api-data-0.5-Ipkpz3wcjEIJthDto7snfd) ghc-devel(http-media-0.8.0.0-9GHxrTRagkN589CoQuo7sU) ghc-devel(http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6) ghc-devel(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX) ghc-devel(mtl-2.2.2) ghc-devel(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-devel(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) ghc-devel(servant-0.19.1-CkczWd9pQYqHxItHfQRhzE) ghc-devel(sop-core-0.5.0.2-C2iIEVjE1N8Lg8Q4QDHkLe) ghc-devel(string-conversions-0.4.0.1-B4OFWvpC4GeAVPq9bBfwkx) ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) ghc-devel(text-2.0.2) ghc-devel(transformers-0.5.6.2) ghc-devel(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) ghc-devel(wai-3.2.3-LsLg4DRwusRI7b3SRdjDzn) ghc-devel(wai-app-static-3.1.7.4-9UpsDZD9lQf3J0Cj3szLw2) ghc-devel(word8-0.1.3-9uGjviso2af8K0EP8UmxRD) ghc-servant-server"

inherit rpm
