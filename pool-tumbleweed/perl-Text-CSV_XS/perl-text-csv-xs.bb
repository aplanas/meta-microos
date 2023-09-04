SUMMARY = "Comma-Separated Values manipulation routines"
DESCRIPTION = "Text::CSV_XS provides facilities for the composition and decomposition of \
comma-separated values. An instance of the Text::CSV_XS class will combine \
fields into a 'CSV' string and parse a 'CSV' string into fields. \
 \
The module accepts either strings or files as input and support the use of \
user-specified characters for delimiters, separators, and escapes."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.510.0"

RPM_NAME = "perl-Text-CSV_XS-1.510.0-1.1.aarch64.rpm"
RPM_HASH = "615769cb69a5cbecdfe83186fc5a79e012970297dcde7851c6f8298b86ec51ec3187f26fb48a69e6ab936134fc2c56ba71cb9a02df2c0e78809e25d196ac6df8"

RPROVIDES:${PN} += "perl-Text--CSV-XS \
perl-Text-CSV-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
