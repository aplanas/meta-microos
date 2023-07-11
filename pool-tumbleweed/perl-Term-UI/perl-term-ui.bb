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

RPM_NAME = "perl-Term-UI-0.50-1.10.noarch.rpm"
RPM_HASH = "79dc736d3c8ffd985994695cdb49f5f77d20aa0fb39dcaa63562408e5db830f3b02e56d050b36a9b4092a4fb65e7ebd873108a47552af0038efd1c354c4e9f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Term--UI \
perl-Term--UI--History \
perl-Term-UI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Locale--Maketext--Simple \
perl-Log--Message--Simple \
perl-Params--Check \
perl-parent"

inherit rpm
