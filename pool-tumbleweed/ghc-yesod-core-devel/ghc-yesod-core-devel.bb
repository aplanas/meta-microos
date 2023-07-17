SUMMARY = "Haskell yesod-core library development files"
DESCRIPTION = "This package provides the Haskell yesod-core library development files."
LICENSE = "MIT"

PV = "1.6.24.2"

RPM_NAME = "ghc-yesod-core-devel-1.6.24.2-1.8.aarch64.rpm"
RPM_HASH = "aa7d810350fb882065da2739bd304349862b973b23c5ff3ed4bb2e28d3b6cb942f6620c86eb7473dc4e513f7fdf9205ab24838eb81f0cec1580008dbf6245f84"

RPROVIDES:${PN} += "ghc-devel-yesod-core-1.6.24.2-7isfGP7hc9NLFaHQAgg8t \
ghc-yesod-core-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-devel-clientsession-0.9.1.2-LlqL6bYAJ8NAeAYS4avg1k \
ghc-devel-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-devel-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-devel-containers-0.6.7 \
ghc-devel-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-devel-fast-logger-3.1.2-FrZhfcoVNTvDFmA3ecjq8Q \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-monad-logger-0.3.40-JON4xqa3KWj1ClCWFJbFYV \
ghc-devel-mtl-2.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4 \
ghc-devel-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-devel-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-devel-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-devel-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-devel-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-extra-3.1.13.0-LFtqIngDY3AAQ1a5w3zKO8 \
ghc-devel-wai-logger-2.4.0-JuVFE6hpBhqDKHgP60Zmqn \
ghc-devel-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-devel-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-yesod-core"

inherit rpm
