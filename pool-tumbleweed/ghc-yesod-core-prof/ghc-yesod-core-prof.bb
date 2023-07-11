SUMMARY = "Haskell yesod-core profiling library"
DESCRIPTION = "This package provides the Haskell yesod-core profiling library."
LICENSE = "MIT"

PV = "1.6.24.2"

RPM_NAME = "ghc-yesod-core-prof-1.6.24.2-1.7.aarch64.rpm"
RPM_HASH = "eb1dc86c9859370d76e4f17535225dde3e6abb945504057017e4b66bbfab70d08161127091d4929e5099bd5463ed290d89f9ff492b7e1aaa23142932f352e7ee"

RPROVIDES:${PN} += "ghc-prof-yesod-core-1.6.24.2-8wK3xEIlG3CBsmvalvvZaH \
ghc-yesod-core-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f \
ghc-prof-clientsession-0.9.1.2-LlqL6bYAJ8NAeAYS4avg1k \
ghc-prof-conduit-1.3.5-EjJ71P6EbmSGTrvJLquwgr \
ghc-prof-conduit-extra-1.3.6-1ns4btxv78gDsSQyRueTL2 \
ghc-prof-containers-0.6.7 \
ghc-prof-cookie-0.4.6-Dg4BNZOQbFj7M1J2IgDFKE \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-entropy-0.4.1.10-HkaMHQZP8nyRj15panvtP \
ghc-prof-fast-logger-3.1.2-B9zh4yvWMU69CA1ZW1MVtN \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-monad-logger-0.3.40-G052AHl2mRW3aPPonmcvVW \
ghc-prof-mtl-2.2.2 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-path-pieces-0.2.1-7L2E0FvnHzn1hGutNz0iw4 \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-random-1.2.1.1-I0wUgAAbf0g3qHR3e8uT0o \
ghc-prof-resourcet-1.2.6-69eF6Rrz9wX13sOJF59GPv \
ghc-prof-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-prof-unliftio-0.2.25.0-DN1mY49M6dHDqA19Vm4lY3 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-extra-3.1.13.0-3pmfL93b8iXAmoBQvHdwGU \
ghc-prof-wai-logger-2.4.0-HFZNBDhfTBI6FWxvAW2OQE \
ghc-prof-warp-3.3.25-7qOcByHeVpuMAFF4vrupa \
ghc-prof-word8-0.1.3-9uGjviso2af8K0EP8UmxRD \
ghc-yesod-core-devel"

inherit rpm
