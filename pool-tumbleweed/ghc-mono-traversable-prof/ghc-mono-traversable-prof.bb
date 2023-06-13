SUMMARY = "Haskell mono-traversable profiling library"
DESCRIPTION = "This package provides the Haskell mono-traversable profiling library."
LICENSE = "MIT"

PV = "1.0.15.3"

RPM_NAME = "ghc-mono-traversable-prof-1.0.15.3-2.3.aarch64.rpm"
RPM_HASH = "fd188e80b358393c8b06f7763cd775fbc6ea7c643714a4982e662a68a02cdfadcef13553b66cc5511c17013128b0cf7d0976c283f703d42b869b986fa18b69cd"

RPROVIDES:${PN} += "ghc-mono-traversable-prof \
ghc-mono-traversable-prof(aarch-64) \
ghc-prof(mono-traversable-1.0.15.3-IT8tyCr3vQLKgjlccagv2S)"

RDEPENDS:${PN} += "ghc-mono-traversable-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt) \
ghc-prof(split-0.2.3.5-u3oGLAiW7JJbxIffWSCWf) \
ghc-prof(text-2.0.2) \
ghc-prof(transformers-0.5.6.2) \
ghc-prof(unordered-containers-0.2.19.1-KblUXVJ0SvRCcK89PoBx7E) \
ghc-prof(vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp) \
ghc-prof(vector-algorithms-0.9.0.1-BIFHuMvuTIO1lWGrhqtqm6)"

inherit rpm
