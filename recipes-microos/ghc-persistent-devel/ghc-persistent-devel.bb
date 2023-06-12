SUMMARY = "Haskell persistent library development files"
DESCRIPTION = "This package provides the Haskell persistent library development files."
LICENSE = "MIT"

PV = "2.14.5.0"

RPM_NAME = "ghc-persistent-devel-2.14.5.0-1.4.aarch64.rpm"
RPM_HASH = "77abacbfc98c4fa5b817903b3d481bb4b5b8064c6f54448f5558ad055fe20d36434a7392dd81d880b9f084942bb937eada21ed164e693070bd11dd7e8a8beb53"

RPROVIDES:${PN} += "ghc-devel(persistent-2.14.5.0-52EbT4CA3Ct4CmrnsbaA80) \
ghc-persistent-devel \
ghc-persistent-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-devel(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-devel(http-api-data-0.5-Ipkpz3wcjEIJthDto7snfd) \
ghc-devel(lift-type-0.1.1.1-2p47b0Ftg8mEbzaiZ22oeB) \
ghc-devel(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) \
ghc-devel(mtl-2.2.2) \
ghc-devel(path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4) \
ghc-devel(resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW) \
ghc-devel(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-devel(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-devel(silently-1.2.5.3-HiTtkArMijI9DvRcUmgkYR) \
ghc-devel(template-haskell-2.19.0.0) \
ghc-devel(text-2.0.2) \
ghc-devel(th-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx) \
ghc-devel(time-1.12.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) \
ghc-devel(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-devel(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-persistent"

inherit rpm
