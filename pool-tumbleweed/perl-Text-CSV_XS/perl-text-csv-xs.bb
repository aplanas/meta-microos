SUMMARY = "Comma-Separated Values manipulation routines"
DESCRIPTION = "Text::CSV_XS provides facilities for the composition and decomposition of \
comma-separated values. An instance of the Text::CSV_XS class will combine \
fields into a 'CSV' string and parse a 'CSV' string into fields. \
 \
The module accepts either strings or files as input and support the use of \
user-specified characters for delimiters, separators, and escapes."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.50"

RPM_NAME = "perl-Text-CSV_XS-1.50-1.3.aarch64.rpm"
RPM_HASH = "cfcc83e9829d6367717775c102848f01aa278d91755ea5c40860ac99b0accad50c424ba5b377a21cbbd87026a296f2edcbc39340f4a0305fcca3c09fa3f1d94c"

RPROVIDES:${PN} += "perl-Text--CSV-XS \
perl-Text-CSV-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
