SUMMARY = "Haskell hslua-typing library development files"
DESCRIPTION = "This package provides the Haskell hslua-typing library development files."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "ghc-hslua-typing-devel-0.1.0-1.3.aarch64.rpm"
RPM_HASH = "6d7053488872fa4c8c339550b437d416827fd99c4bcec0f3c9638e7e9e444896b9587de30146714c9e3f7b8f77f8703fb2f6491887f6bb35ed244c8d435e33eb"

RPROVIDES:${PN} += "ghc-devel-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-hslua-typing-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-text-2.0.2 \
ghc-hslua-typing"

inherit rpm
