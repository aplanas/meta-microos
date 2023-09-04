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

RPM_NAME = "ghc-tabular-0.2.2.8-4.8.aarch64.rpm"
RPM_HASH = "2fafa3e697a99c1f084bd1c064e4d6d43f5470ae039567c03951debf2721f67e09ce383737971a2d05b8b68cd5cf892ef9f2fe55860306f1367be1d5ebf6bf22"

RPROVIDES:${PN} += "ghc-tabular \
libHStabular-0.2.2.8-6UpIsHxi6ag26Q8LzRReTM-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSarray-0.5.4.0-ghc9.4.6.so \
libHSbase-4.17.2.0-ghc9.4.6.so \
libHSbinary-0.8.9.1-ghc9.4.6.so \
libHSbytestring-0.11.5.1-ghc9.4.6.so \
libHScontainers-0.6.7-ghc9.4.6.so \
libHScsv-0.1.2-D7ZtQLgQlciDV3aF4oWKCf-ghc9.4.6.so \
libHSdeepseq-1.4.8.0-ghc9.4.6.so \
libHSfilepath-1.4.2.2-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-boot-th-9.4.6-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libHShtml-1.0.1.2-Ei0LKBl3CyAHMF3GZI2hqu-ghc9.4.6.so \
libHSmtl-2.2.2-ghc9.4.6.so \
libHSparsec-3.1.16.1-ghc9.4.6.so \
libHSpretty-1.1.3.6-ghc9.4.6.so \
libHStemplate-haskell-2.19.0.0-ghc9.4.6.so \
libHStext-2.0.2-ghc9.4.6.so \
libHStransformers-0.5.6.2-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
