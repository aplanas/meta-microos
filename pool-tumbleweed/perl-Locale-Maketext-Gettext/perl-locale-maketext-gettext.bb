SUMMARY = "Joins the gettext and Maketext frameworks"
DESCRIPTION = "Locale::Maketext::Gettext joins the GNU gettext and Maketext frameworks. It \
is a subclass of Locale::Maketext(3) that follows the way GNU gettext \
works. It works seamlessly, _both in the sense of GNU gettext and \
Maketext_. As a result, you _enjoy both their advantages, and get rid of \
both their problems, too._ \
 \
You start as a usual GNU gettext localization project: Work on PO files \
with the help of translators, reviewers and Emacs. Turn them into MO files \
with _msgfmt_. Copy them into the appropriate locale directory, such as \
_/usr/share/locale/de/LC_MESSAGES/myapp.mo_. \
 \
Then, build your Maketext localization class, with your base class changed \
from Locale::Maketext(3) to Locale::Maketext::Gettext. That is all."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.32"

RPM_NAME = "perl-Locale-Maketext-Gettext-1.32-1.10.noarch.rpm"
RPM_HASH = "c6715f52345cbc54291a62aa6f2ef3a1655334028e810b0201f1823657d6b3c62e2d58690dbe61ca9abc79f5c9037e7cd2464047903f14ecbb84a0924939e8c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Locale::Maketext::Gettext) \
perl(Locale::Maketext::Gettext::Functions) \
perl(Locale::Maketext::Gettext::Functions::_EMPTY) \
perl(Locale::Maketext::Gettext::Functions::_EMPTY::i_default) \
perl-Locale-Maketext-Gettext"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
