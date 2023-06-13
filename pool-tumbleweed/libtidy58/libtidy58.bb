SUMMARY = "Library to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "TidyLib is a library for cleaning up and pretty printing HTML, XHTML and XML \
markup in a variety of file encodings. For HTML variants, it can detect and \
report proprietary elements as well as many common coding errors, correct them \
and produce visually equivalent markup which is both compliant with W3C \
standards and works on most browsers. Furthermore, it can convert plain HTML \
into XHTML. For generic XML files, Tidy is limited to correcting basic \
well-formedness errors and pretty printing. \
 \
There is a command line frontend for this library, contained in the package \
'tidy'."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "libtidy58-5.8.0-1.8.aarch64.rpm"
RPM_HASH = "0a5ec11bccc36b3cf6872f3870362eec6cf8796f3a44a7149ee0a4f5290f2eb465425ae62d9d1499286dc28e712d9b718bdc25d3dfdb197487cb0d648ab21e7c"

RPROVIDES:${PN} += "libtidy.so.58()(64bit) \
libtidy58 \
libtidy58(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
