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

RPM_NAME = "perl-DBIx-Transaction-1.100-23.29.aarch64.rpm"
RPM_HASH = "55b8a35f00298f7ad5b18d41204eb6d1156c3e720eae213cc418bb57b721129643ea4332587f90ef3e68bfff806fe6e60c502375c3ee130cafb4f8373bd38593"

RPROVIDES:${PN} += "perl(DBIx::Transaction) \
perl(DBIx::Transaction::db) \
perl(DBIx::Transaction::st) \
perl-DBIx-Transaction \
perl-DBIx-Transaction(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl-DBI"

inherit rpm
