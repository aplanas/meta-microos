SUMMARY = "Haskell concurrent-output profiling library"
DESCRIPTION = "This package provides the Haskell concurrent-output profiling library."
LICENSE = "BSD-2-Clause"

PV = "1.10.18"

RPM_NAME = "ghc-concurrent-output-prof-1.10.18-1.3.aarch64.rpm"
RPM_HASH = "f7491e3f2ffbf11c3f02432ddafc2c935a57cf51345ba9ffcf065fcfafffc5c11f8543a864a285f1941786a3fc9d0c2d0ae9b44b39a9bb7edbd024453bd83419"

RPROVIDES:${PN} += "ghc-concurrent-output-prof \
ghc-prof-concurrent-output-1.10.18-4HoKjF75kdc50vpaCCjUbI"

RDEPENDS:${PN} += "ghc-concurrent-output-devel \
ghc-prof-ansi-terminal-0.11.5-5x0MoHxm5r6DDoyv5djCW3 \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF \
ghc-prof-base-4.17.1.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-process-1.6.16.0 \
ghc-prof-stm-2.5.1.0 \
ghc-prof-terminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unix-2.7.3"

inherit rpm
