SUMMARY = "Haskell wai-app-static library development files"
DESCRIPTION = "This package provides the Haskell wai-app-static library development files."
LICENSE = "MIT"

PV = "3.1.7.4"

RPM_NAME = "ghc-wai-app-static-devel-3.1.7.4-2.8.aarch64.rpm"
RPM_HASH = "37833af932d6afa7f0be22b199e9813c97acbbff953fbdd5fb763dc8f6cf933eeea586c3f30d8651f96fce2ec00e01c8bb9704241e6dab01ef847415fa18745b"

RPROVIDES:${PN} += "ghc-devel-wai-app-static-3.1.7.4-AZD11N92jseJEftpoR1SbX \
ghc-wai-app-static-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-html-0.9.1.2-38lyFDueaN76YOL6QIMVAR \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-directory-1.3.7.1 \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-http-date-0.0.11-IfCBGXPFiMuIKzFtOTNgnD \
ghc-devel-http-types-0.12.3-4BrMFwRucoT4fBt8cCVFS6 \
ghc-devel-memory-0.18.0-8CsggfkyXReDSMbRoae4Yp \
ghc-devel-mime-types-0.1.1.0-IrWGRRDe33Y1D55h7nh7fm \
ghc-devel-old-locale-1.0.0.7-B5o2Qz0CVVSCB1XGw7OfzR \
ghc-devel-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-wai-3.2.3-B6oJGZed88IFIvDpwN5I7x \
ghc-devel-wai-extra-3.1.13.0-LFtqIngDY3AAQ1a5w3zKO8 \
ghc-devel-warp-3.3.25-EsJVhH2AisSK67jSo7D0GP \
ghc-devel-zlib-0.6.3.0-GaFaUl6t8QzEoHIQXsottk \
ghc-wai-app-static"

inherit rpm
