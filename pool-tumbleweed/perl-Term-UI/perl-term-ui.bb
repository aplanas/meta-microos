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

RPM_NAME = "perl-Term-UI-0.50-1.11.noarch.rpm"
RPM_HASH = "214cebfa560adf26a702e8791bc34fe742609a0f6a6415da29835150d4ee792c47d80d267f01dc15a7798522428059b39a081dd3964c6e4bc11c0eaf53ca09bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--UI \
perl-Term--UI--History \
perl-Term-UI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Locale--Maketext--Simple \
perl-Log--Message--Simple \
perl-Params--Check \
perl-parent"

inherit rpm
