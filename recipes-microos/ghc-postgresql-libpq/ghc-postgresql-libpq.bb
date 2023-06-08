SUMMARY = "Low-level binding to libpq"
DESCRIPTION = "This is a binding to libpq: the C application programmer's interface to \
PostgreSQL. libpq is a set of library functions that allow client programs to \
pass queries to the PostgreSQL backend server and to receive the results of \
these queries."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-0.9.5.0-2.3.aarch64.rpm"
RPM_HASH = "09ed7946be663057948ef9c42aa9eb5d5e4070eff4e515ba70f60d1ab24d093842dcf9aacf1785c2601df237bb131b429a504f0a60f3a666ca3baf4292134c8c"

RPROVIDES:${PN} += "ghc-postgresql-libpq ghc-postgresql-libpq(aarch-64) libHSpostgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox-ghc9.4.5.so()(64bit)"
RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) libHStime-1.12.2-ghc9.4.5.so()(64bit) libHSunix-2.7.3-ghc9.4.5.so()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libpq.so.5()(64bit)"

inherit rpm
