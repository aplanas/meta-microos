SUMMARY = "Line Wrapping Module"
DESCRIPTION = "Line wrapping module with support for multibyte, fullwidth, and combining \
characters and languages without whitespaces between words."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Text-WrapI18N-0.06-9.25.noarch.rpm"
RPM_HASH = "38f3e7e4e7c5810a528cdf73c3e45ce7538b7bfea289c1cd5d90b8fd588846c2c2d359cdee427a0e95c10fc2629974e54ec397ad5f151e8a226ac7d86050c4dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--WrapI18N \
perl-Text-WrapI18N"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Text--CharWidth"

inherit rpm
