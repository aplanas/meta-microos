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

RPM_NAME = "perl-DBIx-Simple-1.37-1.21.noarch.rpm"
RPM_HASH = "88344c255ab8c1a425d492b5e6f09e22c269f349cfbe0187e912a4fe2534160231f3afb5a6a0d00a04961c54ec6410a623cad181f230b1073c6a3e555a657579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Simple \
perl-DBIx--Simple--DeadObject \
perl-DBIx--Simple--Dummy \
perl-DBIx--Simple--Result \
perl-DBIx--Simple--Result--RowObject \
perl-DBIx--Simple--Statement \
perl-DBIx-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBI"

inherit rpm
