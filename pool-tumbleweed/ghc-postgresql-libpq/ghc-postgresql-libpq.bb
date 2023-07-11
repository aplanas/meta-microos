SUMMARY = "Low-level binding to libpq"
DESCRIPTION = "This is a binding to libpq: the C application programmer's interface to \
PostgreSQL. libpq is a set of library functions that allow client programs to \
pass queries to the PostgreSQL backend server and to receive the results of \
these queries."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-0.9.5.0-2.7.aarch64.rpm"
RPM_HASH = "9ede78f01d6e6646044ce7e3aa24bb5fd5544eddd936086d1eb7c4b909fdf3819f3240e6533f5d0e9500af976a795eaa0fef69d71f0de3034637445c2aa501b8"

RPROVIDES:${PN} += "ghc-postgresql-libpq \
libHSpostgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHSunix-2.7.3-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libpq.so.5"

inherit rpm
