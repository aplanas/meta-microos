SUMMARY = "Haskell hadolint profiling library"
DESCRIPTION = "This package provides the Haskell hadolint profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "ghc-hadolint-prof-2.12.0-1.8.aarch64.rpm"
RPM_HASH = "775b6d47ccd9803a14d984ad7dc324b42719e3750aa6fa923ca33137646e4ad80694ca8b0a2a7038c2d5ec1484fbcf52d442cd2f9b7d0398f8d7bc37fcae03ad"

RPROVIDES:${PN} += "ghc-hadolint-prof \
ghc-prof-hadolint-2.12.0-48fxNqFFUC1B7dRYbVUu2N"

RDEPENDS:${PN} += "ghc-hadolint-devel \
ghc-prof-Cabal-3.8.1.0 \
ghc-prof-HsYAML-0.2.1.1-KzoQvRN4UKW2jR1yND83sf \
ghc-prof-ShellCheck-0.9.0-LWMFFJLMPa51QWRCVvm68p \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-colourista-0.1.0.2-5hJOPOBvzIt9IdOCkudaU3 \
ghc-prof-containers-0.6.7 \
ghc-prof-cryptonite-0.30-cxpuRFsDaEEZnBeTxvUaJ \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-email-validate-2.3.2.18-8MZFHS3GPuQLNTYP4EPLHD \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-foldl-1.4.14-6AA7lw3dsEK1uUeCGro40c \
ghc-prof-gitrev-1.3.1-CQYGfdCfGPeA3DF217wQTZ \
ghc-prof-ilist-0.4.0.1-KsvLIKFcqVNEl2m4LjZZwM \
ghc-prof-language-docker-11.0.0-6yi9Nm1hnNl1NYn66IUrp7 \
ghc-prof-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-prof-mtl-2.2.2 \
ghc-prof-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-prof-optparse-applicative-0.18.1.0-EzAv0xKPJOa274kXT9Znff \
ghc-prof-parallel-3.2.2.0-36KAHtmQlbB59K6tPbQ0Jr \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-prettyprinter-1.7.1-1jjh6iCiPNl8MgeqtPsio2 \
ghc-prof-semver-0.4.0.1-ExZNCX3NISc5JbXfrvXt6N \
ghc-prof-spdx-1.0.0.3-JwdNfzEpnM57Bwmw6OiiTp \
ghc-prof-split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-timerep-2.1.0.0-I3sgV342xF22sEKbdw3Ltk \
ghc-prof-void-0.7.3-GHzyjd8VkpoJvEZLjo6Bsz"

inherit rpm
