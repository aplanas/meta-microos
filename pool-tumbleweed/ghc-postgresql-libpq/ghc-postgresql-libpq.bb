SUMMARY = "Low-level binding to libpq"
DESCRIPTION = "This is a binding to libpq: the C application programmer's interface to \
PostgreSQL. libpq is a set of library functions that allow client programs to \
pass queries to the PostgreSQL backend server and to receive the results of \
these queries."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-0.9.5.0-2.9.aarch64.rpm"
RPM_HASH = "778f9aecd8830983d0d196f1e4a40d8b3e0e66749f775e9a78815eae8b6294afb36e7a331b8d58a449c019e156226c4dc199275c9cbabe0d0d55a1dcfc474c9d"

RPROVIDES:${PN} += "ghc-postgresql-libpq \
libHSpostgresql-libpq-0.9.5.0-LAEYJt6pIENHmjvWelVvQG-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHSunix-2.7.3-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libpq.so.5"

inherit rpm
