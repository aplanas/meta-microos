SUMMARY = "CursesWidgets Perl module"
DESCRIPTION = "NOTE:  This is **NOT** backwards compatible with the pre-1.99 versions. \
       This is entirely OO-based, hence any older scripts relying on the \
       old versions will need to be rewritten."
LICENSE = "GPL-2.0+"

PV = "1.997"

RPM_NAME = "perl-CursesWidgets-1.997-164.25.noarch.rpm"
RPM_HASH = "08e1571442696855054af2bcdd57d7c9344e37745bb5cab1cd19b409f2694ab87a81324bd6b2451bd8284a45c8df25ad2b6b19618d849bfbcfe9b54407153f3d"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
