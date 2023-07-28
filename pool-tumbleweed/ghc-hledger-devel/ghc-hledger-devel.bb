SUMMARY = "Haskell hledger library development files"
DESCRIPTION = "This package provides the Haskell hledger library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-devel-1.28-3.2.aarch64.rpm"
RPM_HASH = "6831a57d7353d423a81c396feed574017690b77f89700aad6770db86590089d84afbd9c7b9146b59ff9bc0e434e864758c4a53e2d8c947a954b90cc48cb96a3b"

RPROVIDES:${PN} += "ghc-devel-hledger-1.28-6xu5mKG0SdnGvrDCbce5sU \
ghc-hledger-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Decimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX \
ghc-devel-Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-directory-1.3.7.1 \
ghc-devel-extra-1.7.14-9MsHIUa0FAo4DKg07m0mTc \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-githash-0.1.7.0-99BBKgCWJJUA6aWVuD3QRz \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-haskeline-0.8.2 \
ghc-devel-hledger-lib-1.28-8CRsXBZZAO2KJcvUK9hqic \
ghc-devel-lucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w \
ghc-devel-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-devel-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp \
ghc-devel-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-devel-temporary-1.3-9rLWZg49Shk3gKExST32p \
ghc-devel-terminfo-0.4.1.5 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-timeit-2.0-8ewEVtFbCiRSME6yb7iQx \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-devel-utility-ht-0.0.17-3onflAp0qnlITa4Vy6FXwy \
ghc-devel-wizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb \
ghc-hledger"

inherit rpm
