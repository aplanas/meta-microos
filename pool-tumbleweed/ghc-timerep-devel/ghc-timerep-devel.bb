SUMMARY = "Haskell timerep library development files"
DESCRIPTION = "This package provides the Haskell timerep library development files."
LICENSE = "BSD-3-Clause"

PV = "2.1.0.0"

RPM_NAME = "ghc-timerep-devel-2.1.0.0-1.11.aarch64.rpm"
RPM_HASH = "1a0121a955b8a05454a309aefe318270c8be49717769fbc550f71c6c9483ed9d04d5d22739d315ad8574a36d45d7dedc2420129e4b0b7d37cee58ce21e59cefb"

RPROVIDES:${PN} += "ghc-devel-timerep-2.1.0.0-7Ytum8O35f0BaW4NCEYMdH \
ghc-timerep-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-monoid-subclasses-1.2.3-5taTwF7VZKRLlaKR3bOBXt \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-timerep"

inherit rpm
