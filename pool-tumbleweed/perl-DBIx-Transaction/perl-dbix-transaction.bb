SUMMARY = "Allow transactions to be nested in DBI"
DESCRIPTION = "DBIx::Transaction is a wrapper around DBI that helps you manage your \
database transactions. \
 \
 \
 \
Authors: \
-------- \
    Tyler 'Crackerjack' MacDonald <japh@crackerjack.net>"
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.100"

RPM_NAME = "perl-DBIx-Transaction-1.100-23.31.aarch64.rpm"
RPM_HASH = "7391e7b6a1738be46d44071be6eb0afcb2765caad87177835e41169aee670feebb392cc17652eecf8bc99c4c05b8bf076f39c23d3f04161daa9c6ceba33207b2"

RPROVIDES:${PN} += "perl-DBIx--Transaction \
perl-DBIx--Transaction--db \
perl-DBIx--Transaction--st \
perl-DBIx-Transaction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBI"

inherit rpm
