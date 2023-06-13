SUMMARY = "CursesWidgets Perl module"
DESCRIPTION = "NOTE:  This is **NOT** backwards compatible with the pre-1.99 versions. \
       This is entirely OO-based, hence any older scripts relying on the \
       old versions will need to be rewritten."
LICENSE = "GPL-2.0+"

PV = "1.997"

RPM_NAME = "perl-CursesWidgets-1.997-164.24.noarch.rpm"
RPM_HASH = "dfd98d4aebec0a3ecb1187732f3cc7e940001386de88e23da8a84643140d5cbf88ac43a419291dacf0d089f37d6a931ca3571f3490e1161d1f633da7a6af9eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Curses::Widgets) \
perl(Curses::Widgets::ButtonSet) \
perl(Curses::Widgets::Calendar) \
perl(Curses::Widgets::ComboBox) \
perl(Curses::Widgets::Label) \
perl(Curses::Widgets::ListBox) \
perl(Curses::Widgets::ListBox::MultiColumn) \
perl(Curses::Widgets::Menu) \
perl(Curses::Widgets::ProgressBar) \
perl(Curses::Widgets::TextField) \
perl(Curses::Widgets::TextMemo) \
perl-CursesWidgets"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
