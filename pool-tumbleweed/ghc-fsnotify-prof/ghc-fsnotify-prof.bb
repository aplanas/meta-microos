SUMMARY = "Haskell fsnotify profiling library"
DESCRIPTION = "This package provides the Haskell fsnotify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.0"

RPM_NAME = "ghc-fsnotify-prof-0.4.1.0-2.7.aarch64.rpm"
RPM_HASH = "7ffa49f2afe2a83d064751a289eefd91e8918324393e966007a4594872a1c4c7ee48c499ca46f351f2686cabd8d841dd4c1797229d9e45c7fa8212c90cf99720"

RPROVIDES:${PN} += "ghc-fsnotify-prof \
ghc-prof-fsnotify-0.4.1.0-J4WSFHZY5VQ2Gkw2wp8qhw"

RDEPENDS:${PN} += "ghc-fsnotify-devel \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3 \
ghc-prof-monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX \
ghc-prof-safe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3 \
ghc-prof-unix-compat-0.6-79KxxZMmklx25hsmeEnenN"

inherit rpm
