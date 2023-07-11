SUMMARY = "Perl extension to create simple calendars"
DESCRIPTION = "A very simple module that exports one function called 'calendar'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0.1"

RPM_NAME = "perl-Calendar-Simple-2.0.1-1.11.noarch.rpm"
RPM_HASH = "4ca8de742ec58dbf48c706f217773c870971e80f94f8eed8de403bb4b9e8cde5072c2401b93cc2fe46efa397c15051234cd9a44ac02232190b66227970d05185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Calendar--Simple \
perl-Calendar-Simple"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
