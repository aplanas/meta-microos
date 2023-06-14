SUMMARY = "Haskell fsnotify library development files"
DESCRIPTION = "This package provides the Haskell fsnotify library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.0"

RPM_NAME = "ghc-fsnotify-devel-0.4.1.0-2.3.aarch64.rpm"
RPM_HASH = "6c0dabcf957e9a146ea5cf698d3ddd2995ecf4a2517ee850e10bc22f1c4b719bfa7a96c2973246040851643cf4c09f398b2eb296783079d1e75d4b67356a7ac9"

RPROVIDES:${PN} += "ghc-devel-fsnotify-0.4.1.0-2wEvt7wcuNwGNHTpTKKSuK \
ghc-fsnotify-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3 \
ghc-devel-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-devel-safe-exceptions-0.1.7.3-4ydW60ruqZ4IdMpKf3b6BD \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-devel-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-fsnotify"

inherit rpm
