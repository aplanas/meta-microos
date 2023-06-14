SUMMARY = "Postgres monitoring script"
DESCRIPTION = "check_postgres.pl is a Perl script that runs many different tests against one \
or more Postgres databases. It uses the psql program to gather the information, \
and outputs the results in one of three formats: Nagios, MRTG, or simple."
LICENSE = "GPL-2.0-or-later"

PV = "2.26.0"

RPM_NAME = "check_postgres-2.26.0-1.1.noarch.rpm"
RPM_HASH = "10e0c612234147d5031e0ee031afbe5eabc72f9607fc9b93539655e6456fd7d218a3963e2f6d305148cbfd1df805d52394c155dba66c05278a78f672670ec63c"
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
