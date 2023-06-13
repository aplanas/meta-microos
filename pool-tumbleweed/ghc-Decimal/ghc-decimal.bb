SUMMARY = "Decimal numbers with variable precision"
DESCRIPTION = "A decimal number has an integer mantissa and a negative exponent. The exponent \
can be interpreted as the number of decimal places in the value."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "ghc-Decimal-0.5.2-2.2.aarch64.rpm"
RPM_HASH = "4e3f2b0dce67e4f0572abaf6eb20cea613658bcb97b9bbb36a5423870e918cccaf470b39808195a5c73338768cbc0ca1241b953d21d2be7ab1e02e04e80c98db"

RPROVIDES:${PN} += "ghc-Decimal \
ghc-Decimal(aarch-64) \
libHSDecimal-0.5.2-1qhxZ7R9Om3AQz2LFWOWmX-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
