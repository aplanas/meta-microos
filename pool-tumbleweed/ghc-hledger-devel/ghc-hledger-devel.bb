SUMMARY = "Haskell hledger library development files"
DESCRIPTION = "This package provides the Haskell hledger library development files."
LICENSE = "GPL-3.0-or-later"

PV = "1.28"

RPM_NAME = "ghc-hledger-devel-1.28-2.5.aarch64.rpm"
RPM_HASH = "71ea99edcd4e33efef386f630e025d7bd8ae09f61200f241ef022b531445719e61ae79f67b4d23471bf84e53af027c0b8bc02dc5b75a767a19a278458046f5ae"

RPROVIDES:${PN} += "ghc-devel(hledger-1.28-CMg9iFZMqqfKMlM8sLwqzB) \
ghc-hledger-devel \
ghc-hledger-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(Decimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX) \
ghc-devel(Diff-0.4.1-CiDqeLEcsRQOQjfgZOPVP) \
ghc-devel(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) \
ghc-devel(ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3) \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(cmdargs-0.10.22-JxALoPeruUH3tSM40P8Mx) \
ghc-devel(containers-0.6.7) \
ghc-devel(data-default-0.7.1.1-5iNQUD7GKkTDiLEyJaqXSy) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(extra-1.7.13-CLIQu72ADU8JHmf7UWoQG4) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(githash-0.1.6.3-FrkvdbOWDB4772dnMETpxS) \
ghc-devel(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-devel(haskeline-0.8.2) \
ghc-devel(hledger-lib-1.28-IMxaAC2Jv6kCejvdAGIKJn) \
ghc-devel(lucid-2.11.20230408-4Nhfi0FKLIn9BurrsHVz0w) \
ghc-devel(math-functions-0.3.4.2-9rV4yQVX6xI3LaPo90WsZk) \
ghc-devel(megaparsec-9.3.0-9LuWCOgzW7qD3PYWTEm9Pv) \
ghc-devel(microlens-0.4.13.1-ARwI8t2x86cAxRs56XPcG1) \
ghc-devel(mtl-2.2.2) \
ghc-devel(process-1.6.16.0) \
ghc-devel(regex-tdfa-1.3.2-CiIqW6NRXBXL0jfv03YXoU) \
ghc-devel(safe-0.3.19-3Ab0OpSRliCKMhc0t4Nhds) \
ghc-devel(shakespeare-2.0.30-7fp9544x1BC4UOjjHLrTv0) \
ghc-devel(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) \
ghc-devel(tabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp) \
ghc-devel(tasty-1.4.3-FhQLnMluiBU5Fwwb1Rsznz) \
ghc-devel(temporary-1.3-9rLWZg49Shk3gKExST32p) \
ghc-devel(terminfo-0.4.1.5) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(timeit-2.0-8ewEVtFbCiRSME6yb7iQx) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-devel(utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q) \
ghc-devel(utility-ht-0.0.16-CDN97AfZiejDC1itvZ2hyN) \
ghc-devel(wizards-1.0.3-1eOj2T9eMm8Jj6cnosVGZb) \
ghc-hledger"

inherit rpm
