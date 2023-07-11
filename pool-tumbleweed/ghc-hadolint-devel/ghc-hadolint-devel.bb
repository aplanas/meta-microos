SUMMARY = "Haskell hadolint library development files"
DESCRIPTION = "This package provides the Haskell hadolint library development files."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-devel-2.12.0-1.8.aarch64.rpm"
RPM_HASH = "316ebf71d2d5977a2875c867679ead603351303d66cdc94edbe2e06b2e5d2f53b8d5f3c4828b312f058cc24ef484a92d4e15103285b355d620f813c02f279113"

RPROVIDES:${PN} += "ghc-devel-hadolint-2.12.0-48fxNqFFUC1B7dRYbVUu2N \
ghc-hadolint-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-HsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf \
ghc-devel-ShellCheck-0.9.0-LWMFFJLMPa51QWRCVvm68p \
ghc-devel-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-colourista-0.1.0.2-5hJOPOBvzIt9IdOCkudaU3 \
ghc-devel-containers-0.6.7 \
ghc-devel-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-email-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-foldl-1.4.14-6AA7lw3dsEK1uUeCGro40c \
ghc-devel-gitrev-1.3.1-CQYGfdCfGPeA3DF217wQTZ \
ghc-devel-ilist-0.4.0.1-KsvLIKFcqVNEl2m4LjZZwM \
ghc-devel-language-docker-11.0.0-6yi9Nm1hnNl1NYn66IUrp7 \
ghc-devel-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-devel-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-devel-semver-0.4.0.1-ExZNCX3NISc5JbXfrvXt6N \
ghc-devel-spdx-1.0.0.3-JwdNfzEpnM57Bwmw6OiiTp \
ghc-devel-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-timerep-2.1.0.0-I3sgV342xF22sEKbdw3Ltk \
ghc-devel-void-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz \
ghc-hadolint"

inherit rpm
