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

RPM_NAME = "ghc-timezone-olson-0.2.1-2.3.aarch64.rpm"
RPM_HASH = "55933c77286b8b69ad51e64208fa67446b9ae17ddee0a8267436f19c5c3b918654cc185535134d18958636dd2ed1db6be4f74eb3dc05f53fc666576af7db4a08"

RPROVIDES:${PN} += "ghc-timezone-olson \
ghc-timezone-olson(aarch-64) \
libHStimezone-olson-0.2.1-GQQU9hvoQrwIpL0LHxa8ME-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSextensible-exceptions-0.1.1.4-ItoFoaqbPMuGIlsBr6VhGY-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStime-1.12.2-ghc9.4.5.so()(64bit) \
libHStimezone-series-0.1.13-52HOboQTQ6c9WNazbzYdiK-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
