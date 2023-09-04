SUMMARY = "Perl extension to create simple calendars"
DESCRIPTION = "A very simple module that exports one function called 'calendar'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0.3"

RPM_NAME = "perl-Calendar-Simple-2.0.3-1.1.noarch.rpm"
RPM_HASH = "d6bc7dd825659d67bea81bf8ff52318468e674ece72b75071e6d7d55619e11f8a66b46c25aa5737de38a3671901a47858fce4add49c43e8045ad57056916bfc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Calendar--Simple \
perl-Calendar-Simple"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
