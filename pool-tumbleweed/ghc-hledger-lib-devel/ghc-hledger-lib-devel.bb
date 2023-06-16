SUMMARY = "Haskell hledger-lib library development files"
DESCRIPTION = "This package provides the Haskell hledger-lib library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-lib-devel-1.28-2.4.aarch64.rpm"
RPM_HASH = "bd27448296143ad7c8ebace70e9d588ff4bd56f589e95c513a7113620f10d2ad26dcedc67a5a8171e01b2aa5e7755cb7951c9d17d51ccb3407e46586a5859657"

RPROVIDES:${PN} += "ghc-devel-hledger-lib-1.28-IMxaAC2Jv6kCejvdAGIKJn \
ghc-hledger-lib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Decimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX \
ghc-devel-Glob-0.10.2-5tAj3lHfg0h9Pb5bOpMg4R \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-aeson-pretty-0.8.9-LUjG36DF6cc5sU1N5Uw0pr \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-blaze-markup-0.8.2.8-1rqnOPcdOmIw0iYwB3Kqc \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-call-stack-0.4.0-K9VxYWjBEvtITBfD6bL7Dk \
ghc-devel-cassava-0.5.3.0-6nKMpykUjDPH1yduUJ1iAD \
ghc-devel-cassava-megaparsec-2.0.4-2pnivL0ArW7GGP4dYCJwT3 \
ghc-devel-cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-doclayout-0.4.0.1-9Y8Rw4EdBjz2IhzjzOiBy0 \
ghc-devel-extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4 \
ghc-devel-file-embed-0.0.15.0-LJLaBgMyS4K2tBVYbzJ0uw \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p \
ghc-devel-megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv \
ghc-devel-microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1 \
ghc-devel-microlens-th-0.4.3.12-A1OnPrF7gbKLp2skY17lAG \
ghc-devel-mtl-2.2.2 \
ghc-devel-parser-combinators-1.3.0-69OkkuibEVDB76y6u8xJBt \
ghc-devel-pretty-simple-4.1.2.0-LfjX2FlO3KCJ7V5IZrf6zY \
ghc-devel-regex-tdfa-1.3.2-CiIqW6NRXBXL0jfv03YXoU \
ghc-devel-safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds \
ghc-devel-tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp \
ghc-devel-tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz \
ghc-devel-tasty-hunit-0.10.0.3-CV9N1Lkn3CAEveU82YsKyL \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-timeit-2.0-8ewEVtFbCiRSME6yb7iQx \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-uglymemo-0.1.0.1-Balkr8KlO4bDeailuusufT \
ghc-devel-unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E \
ghc-devel-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-hledger-lib"

inherit rpm
