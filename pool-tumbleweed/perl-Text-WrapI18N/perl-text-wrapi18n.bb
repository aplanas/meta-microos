SUMMARY = "Line Wrapping Module"
DESCRIPTION = "Line wrapping module with support for multibyte, fullwidth, and combining \
characters and languages without whitespaces between words."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Text-WrapI18N-0.06-9.26.noarch.rpm"
RPM_HASH = "32935b44f1b590b357515233a320f56008fb44a689d34eef68a7a076dcf629da6ebe50ab7b0f0ce909270068ca007bebc852fbc664c78ac71ca7462117ae430d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--WrapI18N \
perl-Text-WrapI18N"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Text--CharWidth"

inherit rpm
