SUMMARY = "Term::ReadLine UI made easy"
DESCRIPTION = "'Term::UI' is a transparent way of eliminating the overhead of having to \
format a question and then validate the reply, informing the user if the \
answer was not proper and re-issuing the question. \
 \
Simply give it the question you want to ask, optionally with choices the \
user can pick from and a default and 'Term::UI' will DWYM. \
 \
For asking a yes or no question, there's even a shortcut."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.50"

RPM_NAME = "perl-Term-UI-0.50-1.9.noarch.rpm"
RPM_HASH = "3c495f42f6e567186344386caa3e7a09c81989260d4f974f4511d97c6fc05f617bd06494019df7d29819061c6c00f3829bd1cfb319ca5b55601b834ac6193a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Term::UI) \
perl(Term::UI::History) \
perl-Term-UI"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Locale::Maketext::Simple) \
perl(Log::Message::Simple) \
perl(Params::Check) \
perl(parent)"

inherit rpm
