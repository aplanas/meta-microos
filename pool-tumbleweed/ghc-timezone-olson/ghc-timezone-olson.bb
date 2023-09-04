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

RPM_NAME = "ghc-timezone-olson-0.2.1-2.8.aarch64.rpm"
RPM_HASH = "efa678bd926b88bf96b452ffa72050119955ae71499e5befa0813b0f31e80322b36ca2ed7a603d4412b75d386320ee324b86d7876407596930b7c2036879745c"

RPROVIDES:${PN} += "ghc-timezone-olson \
libHStimezone-olson-0.2.1-50v8kH1zEHRIPtzATb6bsi-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSextensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStime-1.12.2-ghc9.4.6.so \
libHStimezone-series-0.1.13-IHWQx2h4brT4vl06IuBnhA-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
