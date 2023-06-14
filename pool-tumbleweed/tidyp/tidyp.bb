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

RPM_NAME = "tidyp-1.04-16.27.aarch64.rpm"
RPM_HASH = "9fb185a296c72d4b889ce7437826749c1afe55c4a49b8f4902684f0400ee6f6b694e3c5d06780e2201e15ac61b48e2ff3845fe92f7fa5b4ea5865fbb0eefd3b3"

RPROVIDES:${PN} += "tidyp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtidyp-1.04.so.0"

inherit rpm
