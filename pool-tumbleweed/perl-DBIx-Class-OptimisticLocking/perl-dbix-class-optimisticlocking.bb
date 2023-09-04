SUMMARY = "Optimistic locking support for DBIx::Class"
DESCRIPTION = "Optimistic locking support for DBIx::Class"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-DBIx-Class-OptimisticLocking-0.02-1.28.noarch.rpm"
RPM_HASH = "5f7578ef83200b22bfc4fd448e14b198a7fe0c034cd4e513e27d2dded95ef084fd7039cd44df896e766864a4e03c27d99aea07e75c348709717bd5094293cade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--OptimisticLocking \
perl-DBIx-Class-OptimisticLocking"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBIx--Class"

inherit rpm
