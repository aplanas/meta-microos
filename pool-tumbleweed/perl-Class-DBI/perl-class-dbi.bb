SUMMARY = "Simple Database Abstraction"
DESCRIPTION = "Simple Database Abstraction"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "3.0.17"

RPM_NAME = "perl-Class-DBI-3.0.17-5.28.noarch.rpm"
RPM_HASH = "ee4f3aa06bee6ceabb8be376704707a0862a69c8333f3de3efa686cc09d792b677b383628e1f4d60d82d1f2a61fce10529b814ab7ded7a61b465b3f629085fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--DBI \
perl-Class--DBI------Base \
perl-Class--DBI--Attribute \
perl-Class--DBI--Cascade--Delete \
perl-Class--DBI--Cascade--Fail \
perl-Class--DBI--Cascade--None \
perl-Class--DBI--Column \
perl-Class--DBI--ColumnGrouper \
perl-Class--DBI--Iterator \
perl-Class--DBI--Query \
perl-Class--DBI--Query--Base \
perl-Class--DBI--Relationship \
perl-Class--DBI--Relationship--HasA \
perl-Class--DBI--Relationship--HasMany \
perl-Class--DBI--Relationship--MightHave \
perl-Class--DBI--SQL--Transformer \
perl-Class--DBI--Search--Basic \
perl-Class--DBI--Test--SQLite \
perl-Class-DBI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-Class--Trigger \
perl-Clone \
perl-Ima--DBI \
perl-UNIVERSAL--moniker \
perl-version"

inherit rpm
