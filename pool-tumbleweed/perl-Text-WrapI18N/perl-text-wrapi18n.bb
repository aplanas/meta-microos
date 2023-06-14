SUMMARY = "Line Wrapping Module"
DESCRIPTION = "Line wrapping module with support for multibyte, fullwidth, and combining \
characters and languages without whitespaces between words."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.06"

RPM_NAME = "perl-Text-WrapI18N-0.06-9.24.noarch.rpm"
RPM_HASH = "063815550bfa0e674496f3ea55c9ceae379a1332b0fa1fab5303aaa5479e464e3fc1c04877e972fecb292bc5ab92b7e4cf5a70fb0334c90df36b2a7a0bc1173a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--WrapI18N \
perl-Text-WrapI18N"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Text--CharWidth"

inherit rpm
