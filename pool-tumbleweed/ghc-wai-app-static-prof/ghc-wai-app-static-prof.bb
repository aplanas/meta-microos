SUMMARY = "Haskell wai-app-static profiling library"
DESCRIPTION = "This package provides the Haskell wai-app-static profiling library."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-prof-3.1.7.4-2.7.aarch64.rpm"
RPM_HASH = "44dfe62c95720d1beb3823ac98031666fbba029f73284b359a510e69520fc03e607b6832a068fdb30390dbd15d1968eb91437b76b61ebe80ec0dd46b3ccb3aa1"

RPROVIDES:${PN} += "ghc-prof-wai-app-static-3.1.7.4-DlFhTXkOZ8ZEEfx67nS2tW \
ghc-wai-app-static-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-directory-1.3.7.1 \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD \
ghc-prof-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-prof-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-prof-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-prof-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-prof-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-prof-wai-extra-3.1.13.0-3pmfL93b8iXAmoBQvHdwGU \
ghc-prof-warp-3.3.25-7qOcByHeVpuMAFF4vrupa \
ghc-prof-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-wai-app-static-devel"

inherit rpm
