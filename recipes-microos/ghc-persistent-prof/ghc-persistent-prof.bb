SUMMARY = "Haskell persistent profiling library"
DESCRIPTION = "This package provides the Haskell persistent profiling library."
LICENSE = "MIT"

PV = "2.14.5.0"

RPM_NAME = "ghc-persistent-prof-2.14.5.0-1.4.aarch64.rpm"
RPM_HASH = "7b5928a739225205070a2a821b973414bc95279c6c7f8ee4765a7f9608eaa65c9814b76af15511496a582c5f6851e6042be3b0815775da24aa83b98470a6804c"

RPROVIDES:${PN} += "ghc-persistent-prof \
ghc-persistent-prof(aarch-64) \
ghc-prof(persistent-2.14.5.0-52EbT4CA3Ct4CmrnsbaA80)"
RDEPENDS:${PN} += "ghc-persistent-devel \
ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-prof(attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3) \
ghc-prof(base-4.17.1.0) \
ghc-prof(base64-bytestring-1.2.1.0-8KbzJpmSQbYKTeew1rv0hh) \
ghc-prof(blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(conduit-1.3.4.3-dAZVHPSYjL2zQ4RzAuWi2) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(fast-logger-3.1.2-BD2YlybMtRF1w9mLnP3rJ) \
ghc-prof(http-api-data-0.5-Ipkpz3wcjEIJthDto7snfd) \
ghc-prof(lift-type-0.1.1.1-2p47b0Ftg8mEbzaiZ22oeB) \
ghc-prof(monad-logger-0.3.39-6zcML8Hf5KyK4tRVcaUTsA) \
ghc-prof(mtl-2.2.2) \
ghc-prof(path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4) \
ghc-prof(resource-pool-0.4.0.0-CALzen0PV047R0s78YnQuW) \
ghc-prof(resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv) \
ghc-prof(scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1) \
ghc-prof(silently-1.2.5.3-HiTtkArMijI9DvRcUmgkYR) \
ghc-prof(template-haskell-2.19.0.0) \
ghc-prof(text-2.0.2) \
ghc-prof(th-lift-instances-0.1.20-7156sTBHd79IaWXpYE3Pjx) \
ghc-prof(time-1.12.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unliftio-0.2.24.0-Dgc3Qshya29BgIaWsfBy4D) \
ghc-prof(unliftio-core-0.2.1.0-AEtYfdyUWlJCLfz2d4hPbj) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vault-0.3.1.5-1nJxIV9kR8e5L3ZIpYZHc) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp)"

inherit rpm
