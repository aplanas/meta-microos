SUMMARY = "Pure Perl Multi-Level Hash/Array Dbm That Supports Transactions"
DESCRIPTION = "A unique flat-file database module, written in pure perl. True multi-level \
hash/array support (unlike MLDBM, which is faked), hybrid OO / tie() \
interface, cross-platform FTPable files, ACID transactions, and is quite \
fast. Can handle millions of keys and unlimited levels without significant \
slow-down. Written from the ground-up in pure perl -- this is NOT a wrapper \
around a C-based DBM. Out-of-the-box compatibility with Unix, Mac OS X and \
Windows."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.0016"

RPM_NAME = "perl-DBM-Deep-2.0016-1.18.noarch.rpm"
RPM_HASH = "06567d06c877eccf860ae7fb6144b7488f743350b8bcdaf6266edc5f952f2e8747235d7b1690b474b236421c8c5ad6a6e9645e83cffe52a61d170395af42f707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBM--Deep \
perl-DBM--Deep--Array \
perl-DBM--Deep--ConfigData \
perl-DBM--Deep--Engine \
perl-DBM--Deep--Engine--DBI \
perl-DBM--Deep--Engine--File \
perl-DBM--Deep--Hash \
perl-DBM--Deep--Iterator \
perl-DBM--Deep--Iterator--DBI \
perl-DBM--Deep--Iterator--File \
perl-DBM--Deep--Iterator--File--BucketList \
perl-DBM--Deep--Iterator--File--Index \
perl-DBM--Deep--Null \
perl-DBM--Deep--Sector \
perl-DBM--Deep--Sector--DBI \
perl-DBM--Deep--Sector--DBI--Reference \
perl-DBM--Deep--Sector--DBI--Scalar \
perl-DBM--Deep--Sector--File \
perl-DBM--Deep--Sector--File--BucketList \
perl-DBM--Deep--Sector--File--Data \
perl-DBM--Deep--Sector--File--Index \
perl-DBM--Deep--Sector--File--Null \
perl-DBM--Deep--Sector--File--Reference \
perl-DBM--Deep--Sector--File--Scalar \
perl-DBM--Deep--Storage \
perl-DBM--Deep--Storage--DBI \
perl-DBM--Deep--Storage--File \
perl-DBM-Deep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
