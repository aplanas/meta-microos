SUMMARY = "Decimal numbers with variable precision"
DESCRIPTION = "A decimal number has an integer mantissa and a negative exponent. The exponent \
can be interpreted as the number of decimal places in the value."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-0.5.2-2.3.aarch64.rpm"
RPM_HASH = "94fddc39799564c78e24a165babbdf2207f1c6f8190a1c69f90542fde4f7a38fa629e0b20fef12ad31a7bba85967e790f98d91f668dae1d1b5897b4e143a7995"

RPROVIDES:${PN} += "ghc-Decimal \
libHSDecimal-0.5.2-7hu5LwisxJT2rqtwM7eQhT-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
