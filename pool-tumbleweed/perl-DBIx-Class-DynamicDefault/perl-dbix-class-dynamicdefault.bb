SUMMARY = "Automatically set and update fields"
DESCRIPTION = "Automatically set and update fields with values calculated at runtime."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-DBIx-Class-DynamicDefault-0.04-2.20.noarch.rpm"
RPM_HASH = "d4d5b5861d9eda120f3bf783575db388a7ffd6096201f7c4dc68327c4b900ff9c7969d3120f9fea85bc28a2e5d8c8a3c94dbdde07a30b8dbd43d021d549a986a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--DynamicDefault \
perl-DBIx-Class-DynamicDefault"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBIx--Class"

inherit rpm
