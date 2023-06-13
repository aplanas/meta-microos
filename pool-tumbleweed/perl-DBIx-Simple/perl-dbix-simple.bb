SUMMARY = "Very complete easy-to-use OO interface to DBI"
DESCRIPTION = "DBIx::Simple provides a simplified interface to DBI, Perl's powerful \
database module. \
 \
This module is aimed at rapid development and easy maintenance. Query \
preparation and execution are combined in a single method, the result \
object (which is a wrapper around the statement handle) provides easy \
row-by-row and slurping methods. \
 \
The 'query' method returns either a result object, or a dummy object. The \
dummy object returns undef (or an empty list) for all methods and when used \
in boolean context, is false. The dummy object lets you postpone (or skip) \
error checking, but it also makes immediate error checking simply \
'$db->query(...) or die $db->error'."
LICENSE = "MIT"

PV = "1.37"

RPM_NAME = "perl-DBIx-Simple-1.37-1.20.noarch.rpm"
RPM_HASH = "f436813f7da488cf50e6afc63ff3c810102da8aa23e2d2ead5f09f58ad9c0491c904c7570a924024d8e0b8699ff0b7963b7863c3778e14ea80e76028db857f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DBIx::Simple) \
perl(DBIx::Simple::DeadObject) \
perl(DBIx::Simple::Dummy) \
perl(DBIx::Simple::Result) \
perl(DBIx::Simple::Result::RowObject) \
perl(DBIx::Simple::Statement) \
perl-DBIx-Simple"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBI)"

inherit rpm
