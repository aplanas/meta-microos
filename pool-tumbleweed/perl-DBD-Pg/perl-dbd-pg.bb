SUMMARY = "DBI PostgreSQL interface"
DESCRIPTION = "DBD::Pg is a Perl module that works with the DBI module to provide access \
to PostgreSQL databases."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.16.3"

RPM_NAME = "perl-DBD-Pg-3.16.3-1.4.aarch64.rpm"
RPM_HASH = "1502dad8de019446f465ef4916ff27a5b32e4fc974224ffd84de78fb33524468538ed9ada63a209cc2d212086a742202280996f5d14e966cc0f5bf511cdae8fc"

RPROVIDES:${PN} += "perl-Bundle--DBD--Pg \
perl-DBD--Pg \
perl-DBD--Pg--DefaultValue \
perl-DBD--Pg--db \
perl-DBD--Pg--dr \
perl-DBD--Pg--st \
perl-DBD-Pg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
perl--MODULE-COMPAT-5.38.0 \
perl-DBI \
perl-version"

inherit rpm
