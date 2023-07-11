SUMMARY = "Postgres monitoring script"
DESCRIPTION = "check_postgres.pl is a Perl script that runs many different tests against one \
or more Postgres databases. It uses the psql program to gather the information, \
and outputs the results in one of three formats: Nagios, MRTG, or simple."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "check_postgres-2.26.0-1.2.noarch.rpm"
RPM_HASH = "dc69c9c4414148882cf06e695f0ef9cb9ba20cbb7c778d233ab80d6f3ea531c235453d1efb58b2c0f732995270d7f0d63ac42941aa99481121bf67afbd8380b1"
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
