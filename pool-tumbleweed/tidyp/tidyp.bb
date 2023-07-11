SUMMARY = "Utility to Clean Up and Pretty-print HTML, XHTML or XML Markup"
DESCRIPTION = "Tidy is a commandline frontend to TidyLib which allows for cleaning up and \
pretty printing HTML, XHTML and XML markup in a variety of file encodings. For \
HTML variants, it can detect and report proprietary elements as well as many \
common coding errors, correct them and produce visually equivalent markup \
which is both compliant with W3C standards and works on most browsers. \
Furthermore, it can convert plain HTML to XHTML. For generic XML files, Tidy is \
limited to correcting basic well-formedness errors and pretty printing."
LICENSE = "W3C"

PV = "1.04"

RPM_NAME = "tidyp-1.04-16.28.aarch64.rpm"
RPM_HASH = "6a540deec418c20f4f59a3880d53f249360b9d01f40d8698c18774368f210e3d55624778de12b2f04a5f675029a9e8833021bd9b43cdc11c5877986e5448fdd7"

RPROVIDES:${PN} += "tidyp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidyp-1.04.so.0"

inherit rpm
