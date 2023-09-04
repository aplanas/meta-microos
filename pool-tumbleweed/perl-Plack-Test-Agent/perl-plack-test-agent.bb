SUMMARY = "OO interface for testing low-level Plack/PSGI apps"
DESCRIPTION = "OO interface for testing low-level Plack/PSGI apps"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.5"

RPM_NAME = "perl-Plack-Test-Agent-1.5-1.12.noarch.rpm"
RPM_HASH = "fbead380e3e1eac46b888a033323cca85a584ae6aa5392a66ca7356f381c34abe49c807c93e9cf671f4a0ebedee375bd25979b76e785f365730a1975c336ef50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Test--Agent \
perl-Plack-Test-Agent \
perl-Test--WWW--Mechanize--Bound"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTTP--Cookies \
perl-HTTP--Message--PSGI \
perl-HTTP--Request--Common \
perl-HTTP--Response \
perl-Plack--Loader \
perl-Plack--Util--Accessor \
perl-Test--TCP \
perl-Test--WWW--Mechanize \
perl-parent"

inherit rpm
