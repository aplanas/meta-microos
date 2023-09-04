SUMMARY = "Postgres monitoring script"
DESCRIPTION = "check_postgres.pl is a Perl script that runs many different tests against one \
or more Postgres databases. It uses the psql program to gather the information, \
and outputs the results in one of three formats: Nagios, MRTG, or simple."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "check_postgres-2.26.0-1.3.noarch.rpm"
RPM_HASH = "973ae9e51403eda29d90217ae66a66c94935379b481d5990f235157b13e6fe01b7f1fac534182270a6c5f1398001f4f8d7eb8db40bc69a8772a29f6e4e6fea0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "check-postgres"

RDEPENDS:${PN} += "/usr/bin/perl \
perl \
perl-Cwd \
perl-Data--Dumper \
perl-File--Basename \
perl-File--Temp \
perl-Getopt--Long \
perl-Time--HiRes \
postgresql"

inherit rpm
