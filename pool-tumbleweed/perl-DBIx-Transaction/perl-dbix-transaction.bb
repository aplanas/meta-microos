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

RPM_NAME = "perl-DBIx-Transaction-1.100-23.30.aarch64.rpm"
RPM_HASH = "92e55ea63478cdb337d0eb2684b5433c0f57da76ccfa3890863c68e5a2ad72118ba1a5e0f3e5e48df4ce84a25783791e5ff60be80cef59e5ef3460d3d6d1ed9e"

RPROVIDES:${PN} += "perl-DBIx--Transaction \
perl-DBIx--Transaction--db \
perl-DBIx--Transaction--st \
perl-DBIx-Transaction"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBI"

inherit rpm
