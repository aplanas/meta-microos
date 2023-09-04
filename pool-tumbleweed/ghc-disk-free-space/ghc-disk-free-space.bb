SUMMARY = "Retrieve information about disk space usage"
DESCRIPTION = "A cross-platform library for retrieving information about disk space usage."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.1"

RPM_NAME = "ghc-disk-free-space-0.1.0.1-5.3.aarch64.rpm"
RPM_HASH = "4f6522efc52e067cbdd77a37fde24d53edf7300949a6544d32dd7c7260b7a8d86c02d68dc7d141011840e855373815f94f54c885f4c59842bdd9c4d654c4c5d5"

RPROVIDES:${PN} += "ghc-disk-free-space \
libHSdisk-free-space-0.1.0.1-3IatejMIAz9HNNNelqKH6x-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
