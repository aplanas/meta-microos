SUMMARY = "Library to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "TidyLib is a library for cleaning up and pretty printing HTML, XHTML and XML \
markup in a variety of file encodings. For HTML variants, it can detect and \
report proprietary elements as well as many common coding errors, correct them \
and produce visually equivalent markup which is both compliant with W3C \
standards and works on most browsers. Furthermore, it can convert plain HTML \
into XHTML. For generic XML files, Tidy is limited to correcting basic \
well-formedness errors and pretty printing. \
 \
There is a commandline frontend for this library, contained in the package \
'tidy'."
LICENSE = "W3C"

PV = "1.04"

RPM_NAME = "libtidyp-1_04-0-1.04-16.28.aarch64.rpm"
RPM_HASH = "ab5db21c408bf85eebdf28295e5b40cc9a8774fe5c9a6f336d45d0d09c542fefbb33a8e981deecfca31afbf7a2896f88ab985ba6b16bef00d5a7cd5b53ae15bb"

RPROVIDES:${PN} += "libtidyp-1-04-0 \
libtidyp-1.04.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
