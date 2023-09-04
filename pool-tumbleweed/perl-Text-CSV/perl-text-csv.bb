SUMMARY = "Comma-separated values manipulator (using XS or PurePerl)"
DESCRIPTION = "Text::CSV is a thin wrapper for Text::CSV_XS-compatible modules now. All \
the backend modules provide facilities for the composition and \
decomposition of comma-separated values. Text::CSV uses Text::CSV_XS by \
default, and when Text::CSV_XS is not available, falls back on \
Text::CSV_PP, which is bundled in the same distribution as this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Text-CSV-2.02-1.4.noarch.rpm"
RPM_HASH = "79adce5c295525d58a071c895fce074aefbb4ba1af8f31cb8e77f83af7a57f8cbb8ec910100502f971979cdd2994f68842387406f1e0e01373c53c08d166e9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--CSV \
perl-Text--CSV--ErrorDiag \
perl-Text--CSV-PP \
perl-Text-CSV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
