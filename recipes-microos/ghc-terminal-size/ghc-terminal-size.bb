SUMMARY = "Get terminal window height and width"
DESCRIPTION = "Get terminal window height and width without ncurses dependency."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-0.3.4-1.2.aarch64.rpm"
RPM_HASH = "06fda299ae1f752dba9cfc758fa40729b1aff7fddc06929c9344fbb0857bc37bf3eac3b155ba104ac1977c3ebc6c4ba0433375915427227b23ee511ec0163ca1"

RPROVIDES:${PN} += "ghc-terminal-size \
ghc-terminal-size(aarch-64) \
libHSterminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
