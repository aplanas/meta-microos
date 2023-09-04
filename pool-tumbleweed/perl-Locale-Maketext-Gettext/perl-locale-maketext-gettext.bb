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

RPM_NAME = "perl-Locale-Maketext-Gettext-1.32-1.12.noarch.rpm"
RPM_HASH = "13844cd2f92540cfc069accb201bd4bbdd8b182793d553420b277b72e21385fd466489cb822e28265a0e432448c82841a6f5643ec9bed57b697416efcafd6131"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Maketext--Gettext \
perl-Locale--Maketext--Gettext--Functions \
perl-Locale--Maketext--Gettext--Functions---EMPTY \
perl-Locale--Maketext--Gettext--Functions---EMPTY--i-default \
perl-Locale-Maketext-Gettext"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
