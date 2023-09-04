SUMMARY = "CursesWidgets Perl module"
DESCRIPTION = "NOTE:  This is **NOT** backwards compatible with the pre-1.99 versions. \
       This is entirely OO-based, hence any older scripts relying on the \
       old versions will need to be rewritten."
LICENSE = "GPL-2.0+"

PV = "1.997"

RPM_NAME = "perl-CursesWidgets-1.997-164.26.noarch.rpm"
RPM_HASH = "0dd1329587db9f264567e8ce781902f53ef42286c9ebb0fb966b13abc0a8042b226bde8ac0d5809e347b24aab790c3f6630812a2f4d1383889ceaff44a939a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Curses--Widgets \
perl-Curses--Widgets--ButtonSet \
perl-Curses--Widgets--Calendar \
perl-Curses--Widgets--ComboBox \
perl-Curses--Widgets--Label \
perl-Curses--Widgets--ListBox \
perl-Curses--Widgets--ListBox--MultiColumn \
perl-Curses--Widgets--Menu \
perl-Curses--Widgets--ProgressBar \
perl-Curses--Widgets--TextField \
perl-Curses--Widgets--TextMemo \
perl-CursesWidgets"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
