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

RPM_NAME = "perl-DBIx-Simple-1.37-1.22.noarch.rpm"
RPM_HASH = "7cc84ae61dfe0a8adc16c82d6df18c21a5b57a0f940eebe8c45f1890c664f88239bf511f5e31607d3ae128fb99c76bb6507c152947ed764f488e7c6b47b1ca68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Simple \
perl-DBIx--Simple--DeadObject \
perl-DBIx--Simple--Dummy \
perl-DBIx--Simple--Result \
perl-DBIx--Simple--Result--RowObject \
perl-DBIx--Simple--Statement \
perl-DBIx-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBI"

inherit rpm
