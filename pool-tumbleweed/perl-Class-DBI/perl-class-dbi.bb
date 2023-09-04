SUMMARY = "Simple Database Abstraction"
DESCRIPTION = "Simple Database Abstraction"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "3.0.17"

RPM_NAME = "perl-Class-DBI-3.0.17-5.29.noarch.rpm"
RPM_HASH = "d175f0aef1afb7203b95e3bfdda9775529b121df93444a94cacf20a75c40fee895aecffe1f9d1d4391045205b7f40fed996c3c703a60b981bf1ae319b3a69f9f"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor \
perl-Class--Data--Inheritable \
perl-Class--Trigger \
perl-Clone \
perl-Ima--DBI \
perl-UNIVERSAL--moniker \
perl-version"

inherit rpm
