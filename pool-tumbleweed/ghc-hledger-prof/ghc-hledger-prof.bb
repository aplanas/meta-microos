SUMMARY = "Haskell hledger profiling library"
DESCRIPTION = "This package provides the Haskell hledger profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-prof-1.28-3.1.aarch64.rpm"
RPM_HASH = "1efb2a4dcf48b19a8aa1edc4555f74ee3a1814a94535236453af454ca16c176b99beee136a7e2ba8335ae3aaf031e69eac4f23dc69eea9cfab1d620bcc205912"

RPROVIDES:${PN} += "ghc-hledger-prof \
ghc-prof-hledger-1.28-LMGraoAEV376eBGXHCUD0u"

RDEPENDS:${PN} += "ghc-hledger-devel \
ghc-prof-Decimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX \
ghc-prof-Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-githash-0.1.7.0-99BBKgCWJJUA6aWVuD3QRz \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-haskeline-0.8.2 \
ghc-prof-hledger-lib-1.28-KVtwO74sgvi1hMRwtb8EwS \
ghc-prof-lucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w \
ghc-prof-math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk \
ghc-prof-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-prof-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-prof-mtl-2.2.2 \
ghc-prof-process-1.6.16.0 \
ghc-prof-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-shakespeare-2.0.30-LXYSf7m1ZbEJtMw9DSE6kj \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp \
ghc-prof-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-prof-temporary-1.3-9rLWZg49Shk3gKExST32p \
ghc-prof-terminfo-0.4.1.5 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-timeit-2.0-8ewEVtFbCiRSME6yb7iQx \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-prof-utility-ht-0.0.17-3onflAp0qnlITa4Vy6FXwy \
ghc-prof-wizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb"

inherit rpm
