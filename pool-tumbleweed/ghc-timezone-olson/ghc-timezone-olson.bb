SUMMARY = "A pure Haskell parser and renderer for binary Olson timezone files"
DESCRIPTION = "A parser and renderer for binary Olson timezone files whose format is specified \
by the tzfile(5) man page on Unix-like systems. For more information about this \
format, see <http://www.iana.org/time-zones/repository/tz-link.html>. \
Functions are provided for converting the parsed data into 'TimeZoneSeries' \
objects from the timezone-series package. On many platforms, binary Olson \
timezone files suitable for use with this package are available in the \
directory /usr/share/zoneinfo and its subdirectories on your computer. \
For a way to read binary Olson timezone files at compile time, see the \
timezone-olson-th package \
(<http://hackage.haskell.org/package/timezone-olson-th>)."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-timezone-olson-0.2.1-2.6.aarch64.rpm"
RPM_HASH = "b2034e5b1978a0fc67721d76470edfd472dd1fc9dce4b2b62e475fda8bbba93d3ae19c87abe9b17e0a2b2d9ada5f7ac498f82aba85d6d5fde3e90373c73e1415"

RPROVIDES:${PN} += "ghc-timezone-olson \
libHStimezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so \
libHSbase-4.17.1.0-ghc9.4.5.so \
libHSbinary-0.8.9.1-ghc9.4.5.so \
libHSbytestring-0.11.4.0-ghc9.4.5.so \
libHScontainers-0.6.7-ghc9.4.5.so \
libHSdeepseq-1.4.8.0-ghc9.4.5.so \
libHSextensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-boot-th-9.4.5-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libHSpretty-1.1.3.6-ghc9.4.5.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so \
libHStime-1.12.2-ghc9.4.5.so \
libHStimezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
