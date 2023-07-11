SUMMARY = "Get terminal window height and width"
DESCRIPTION = "Get terminal window height and width without ncurses dependency."
LICENSE = "BSD-3-Clause"

PV = "0.3.4"

RPM_NAME = "ghc-terminal-size-0.3.4-1.3.aarch64.rpm"
RPM_HASH = "11498698b18ede41957145258ab30f1273182bcaade21176ad5423602a63f8416d3438163a18f0f185639c3648f7224a030c5f445346c2404f78067c2bd1351e"

RPROVIDES:${PN} += "ghc-terminal-size \
libHSterminal-size-0.3.4-1tPFLsRvnmSGNryq4PMCAd-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
