SUMMARY = "Haskell concurrent-output library development files"
DESCRIPTION = "This package provides the Haskell concurrent-output library development \
files."
LICENSE = "BSD-2-Clause"

PV = "1.10.18"

RPM_NAME = "ghc-concurrent-output-devel-1.10.18-1.3.aarch64.rpm"
RPM_HASH = "e8ebdaf409aeb82f8bad5cdf9f6f966890971422cf56b778d6cebcca371a012c6abd8cd609d59d239a09c85b0ffad3fe80f752a5d5b8440eb584d92d2a0eeb04"

RPROVIDES:${PN} += "ghc-concurrent-output-devel \
ghc-devel-concurrent-output-1.10.18-4HoKjF75kdc50vpaCCjUbI"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-concurrent-output \
ghc-devel-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-devel-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-devel-base-4.17.1.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-process-1.6.16.0 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3"

inherit rpm
