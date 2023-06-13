SUMMARY = "Utility to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "Tidy is a command line frontend to TidyLib which allows for cleaning up and \
pretty printing HTML, XHTML and XML markup in a variety of file encodings. For \
HTML variants, it can detect and report proprietary elements as well as many \
common coding errors, correct them and produce visually equivalent markup \
which is both compliant with W3C standards and works on most browsers. \
Furthermore, it can convert plain HTML to XHTML. For generic XML files, Tidy is \
limited to correcting basic well-formedness errors and pretty printing."
LICENSE = "W3C"

PV = "5.8.0"

RPM_NAME = "tidy-5.8.0-1.8.aarch64.rpm"
RPM_HASH = "639f025c3f63d100a36643b6ddd77d643f4801b080a5d1b14d7054a3b5ed18ca2d8dad810b3925da953b99831358684a802f867bf2a5d06e552277a2e1aeca9b"

RPROVIDES:${PN} += "tidy \
tidy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtidy.so.58()(64bit)"

inherit rpm
