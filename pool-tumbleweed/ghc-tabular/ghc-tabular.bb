SUMMARY = "Two-dimensional data tables with rendering functions"
DESCRIPTION = "Tabular provides a Haskell representation of two-dimensional data tables, the \
kind that you might find in a spreadsheet or or a research report. It also \
comes with some default rendering functions for turning those tables into ASCII \
art, simple text with an arbitrary delimiter, CSV, HTML or LaTeX. \
 \
Below is an example of the kind of output this library produces. The tabular \
package can group rows and columns, each group having one of three separators \
(no line, single line, double line) between its members. \
 \
> || memtest 1 | memtest 2 || time test | time test 2 > \
====++===========+===========++=============+============ > A 1 || hog | \
terrible || slow | slower > A 2 || pig | not bad || fast | slowest > \
----++-----------+-----------++-------------+------------ > B 1 || good | awful \
|| intolerable | bearable > B 2 || better | no chance || crawling | amazing > B \
3 || meh | well... || worst ever | ok."
LICENSE = "BSD-3-Clause"

PV = "0.2.2.8"

RPM_NAME = "ghc-tabular-0.2.2.8-4.3.aarch64.rpm"
RPM_HASH = "850e4e866fde2a88a644c0093bb5d943f7de9c2d6e4017f93283b3481cc3be04555ec4798ae88b5ce57e0b8bd6d3e71e53d04d24ad84726644980f81f05c2f81"

RPROVIDES:${PN} += "ghc-tabular \
ghc-tabular(aarch-64) \
libHStabular-0.2.2.8-5oBUDJP9F9qUMGPeotGAp-ghc9.4.5.so()(64bit)"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.5.so()(64bit) \
libHSbase-4.17.1.0-ghc9.4.5.so()(64bit) \
libHSbinary-0.8.9.1-ghc9.4.5.so()(64bit) \
libHSbytestring-0.11.4.0-ghc9.4.5.so()(64bit) \
libHScontainers-0.6.7-ghc9.4.5.so()(64bit) \
libHScsv-0.1.2-LKioaw43aTAAAKpIk04xxN-ghc9.4.5.so()(64bit) \
libHSdeepseq-1.4.8.0-ghc9.4.5.so()(64bit) \
libHSfilepath-1.4.2.2-ghc9.4.5.so()(64bit) \
libHSghc-bignum-1.3-ghc9.4.5.so()(64bit) \
libHSghc-boot-th-9.4.5-ghc9.4.5.so()(64bit) \
libHSghc-prim-0.9.0-ghc9.4.5.so()(64bit) \
libHShtml-1.0.1.2-U7qWIp0bJwCnAFPlj3UZy-ghc9.4.5.so()(64bit) \
libHSmtl-2.2.2-ghc9.4.5.so()(64bit) \
libHSparsec-3.1.16.1-ghc9.4.5.so()(64bit) \
libHSpretty-1.1.3.6-ghc9.4.5.so()(64bit) \
libHStemplate-haskell-2.19.0.0-ghc9.4.5.so()(64bit) \
libHStext-2.0.2-ghc9.4.5.so()(64bit) \
libHStransformers-0.5.6.2-ghc9.4.5.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit)"

inherit rpm
