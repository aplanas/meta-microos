SUMMARY = "Haskell hledger-lib profiling library"
DESCRIPTION = "This package provides the Haskell hledger-lib profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-prof-1.28-3.1.aarch64.rpm"
RPM_HASH = "c09da5d8cebfb51e139e7ed0f52e774b412e58057095a9be7d268ae49a9cccbaedf54eedc28335091c3ee5ac0aad1431b773d1942cf87d6fdb8c4e16ea45cf91"

RPROVIDES:${PN} += "ghc-hledger-lib-prof \
ghc-prof-hledger-lib-1.28-KVtwO74sgvi1hMRwtb8EwS"

RDEPENDS:${PN} += "ghc-hledger-lib-devel \
ghc-prof-Decimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX \
ghc-prof-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-aeson-pretty-0.8.10-8JRVLG9BqWz7B95FOCRy0B \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.1.0 \
ghc-prof-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-prof-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-prof-cassava-megaparsec-2.0.4-HU3QoIYvAPIHgP080eBDPM \
ghc-prof-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-prof-extra-1.7.14-BoqGpItPSHp5TXSaJGSPpo \
ghc-prof-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p \
ghc-prof-megaparsec-9.3.1-Lptmv1Cc41nKt1ZYt8kXVr \
ghc-prof-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-prof-microlens-th-0.4.3.13-4M5tTOX0ioLGTMiKBp6v2C \
ghc-prof-mtl-2.2.2 \
ghc-prof-parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt \
ghc-prof-pretty-simple-4.1.2.0-AmUJ4bdBPRILOonshKqIvK \
ghc-prof-regex-tdfa-1.3.2.1-IjrqGmQfrKa7qAUI2VJCmV \
ghc-prof-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-prof-tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp \
ghc-prof-tasty-1.4.3-18zApXOtbThAhmaMCCQRWB \
ghc-prof-tasty-hunit-0.10.0.3-6X5qFyvC3YwCq8i9tfXsji \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-timeit-2.0-8ewEVtFbCiRSME6yb7iQx \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-uglymemo-0.1.0.1-Balkr8KlO4bDeailuusufT \
ghc-prof-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q"

inherit rpm
