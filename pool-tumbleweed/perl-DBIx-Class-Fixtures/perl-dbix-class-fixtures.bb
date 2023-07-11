SUMMARY = "Dump data and repopulate a database using rules"
DESCRIPTION = "Dump fixtures from source database to filesystem then import to another \
database (with same schema) at any time. Use as a constant dataset for \
running tests against or for populating development databases when \
impractical to use production clones. Describe fixture set using relations \
and conditions based on your DBIx::Class schema."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.001039"

RPM_NAME = "perl-DBIx-Class-Fixtures-1.001039-1.18.noarch.rpm"
RPM_HASH = "b92ccff7637735a95563f5a18b9c2f4db205b45bb447a3125439aef47b3832cec6b4469dbc425fcd90f05c8ff38b23ad7671e396692a52e5c61224ce9f8006c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--Fixtures \
perl-DBIx--Class--Fixtures--DBI \
perl-DBIx--Class--Fixtures--DBI--Pg \
perl-DBIx--Class--Fixtures--DBI--mysql \
perl-DBIx--Class--Fixtures--External--File \
perl-DBIx--Class--Fixtures--Schema \
perl-DBIx-Class-Fixtures"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Grouped \
perl-Config--Any \
perl-DBIx--Class \
perl-DBIx--Class--Schema--Loader \
perl-Data--Dump--Streamer \
perl-Data--Visitor \
perl-DateTime \
perl-DateTime--Format--MySQL \
perl-DateTime--Format--Pg \
perl-DateTime--Format--SQLite \
perl-File--Copy--Recursive \
perl-File--Temp \
perl-Hash--Merge \
perl-IO--All \
perl-JSON--Syck \
perl-Path--Class \
perl-Scalar--Util"

inherit rpm
