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

RPM_NAME = "libtidyp-1_04-0-1.04-16.27.aarch64.rpm"
RPM_HASH = "cde6686fbedbef80cf0883e7a230f61815a4c9ae03403a26e668365237a95722f586b12cd47342095745d1be5b5a30cce013fe2b1bb56bb8575ebe0a7dc44e83"

RPROVIDES:${PN} += "libtidyp-1.04.so.0()(64bit) \
libtidyp-1_04-0 \
libtidyp-1_04-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
