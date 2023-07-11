SUMMARY = "Comma-separated values manipulator (using XS or PurePerl)"
DESCRIPTION = "Text::CSV is a thin wrapper for Text::CSV_XS-compatible modules now. All \
the backend modules provide facilities for the composition and \
decomposition of comma-separated values. Text::CSV uses Text::CSV_XS by \
default, and when Text::CSV_XS is not available, falls back on \
Text::CSV_PP, which is bundled in the same distribution as this module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Text-CSV-2.02-1.3.noarch.rpm"
RPM_HASH = "cf891bf64b3138c6f8ddd7a50e8ef5fb89a21285888a37e05d6e4399a3bb8775d2557ce853d41459f37615691d4a41f81c67271116ec122393eff3004b7a3e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--CSV \
perl-Text--CSV--ErrorDiag \
perl-Text--CSV-PP \
perl-Text-CSV"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
