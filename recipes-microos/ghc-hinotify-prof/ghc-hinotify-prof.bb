SUMMARY = "Haskell hinotify profiling library"
DESCRIPTION = "This package provides the Haskell hinotify profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "ghc-hinotify-prof-0.4.1-3.2.aarch64.rpm"
RPM_HASH = "7dcffa8859f0d7a49223511010f4bdeea7f6941d87772f1f9cc2d2c15987b69e41db4399d4e46d610378e48a7e81a4849d037c524e9465c7a0ac0d93f0a544d8"

RPROVIDES:${PN} += "ghc-hinotify-prof \
ghc-hinotify-prof(aarch-64) \
ghc-prof(hinotify-0.4.1-8EvWCUqnZLR2V2Cj5bSrk3)"
RDEPENDS:${PN} += "ghc-hinotify-devel \
ghc-prof(async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF) \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(unix-2.7.3)"

inherit rpm
