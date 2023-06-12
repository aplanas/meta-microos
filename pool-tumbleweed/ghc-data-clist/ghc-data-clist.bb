SUMMARY = "Simple functional ring type"
DESCRIPTION = "Simple functional bidirectional ring type. Given that the ring terminiology \
clashes with certain mathematical branches, we're using the term CList or \
CircularList instead."
LICENSE = "BSD-3-Clause"

PV = "0.2"

RPM_NAME = "ghc-data-clist-0.2-2.2.aarch64.rpm"
RPM_HASH = "6eb59e3c0ee42276e71c2295e9840cce584fd19f1a28319eb15b1c8e21c83c54608862c761fdf00f1fedcb7f8a9974bc9db2983c56babae6881ba1d92d843d99"

RPROVIDES:${PN} += "ghc-data-clist \
ghc-data-clist(aarch-64) \
libHSdata-clist-0.2-LT5UCpKeur34zcxFsnpoqW-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
