SUMMARY = "OO interface for testing low-level Plack/PSGI apps"
DESCRIPTION = "OO interface for testing low-level Plack/PSGI apps"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.5"

RPM_NAME = "perl-Plack-Test-Agent-1.5-1.11.noarch.rpm"
RPM_HASH = "314ece6e950a7ecc200eabc515ef3a1da0fcf1f44ff3df1ac371c19b418de5cafd6d9252d2be64c90c3612a5b0c16c55ff553abcf0ce6fe2504cae82a37a4301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Test--Agent \
perl-Plack-Test-Agent \
perl-Test--WWW--Mechanize--Bound"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
