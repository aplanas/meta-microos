SUMMARY = "Optimistic locking support for DBIx::Class"
DESCRIPTION = "Optimistic locking support for DBIx::Class"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-DBIx-Class-OptimisticLocking-0.02-1.27.noarch.rpm"
RPM_HASH = "72dff497db4b45679f0089dd9546b6bb304f22734180146c9ceb8cbc0c541e4224aa3dd531e726c39cc164bbb294be83f2c002768e2423a3320caac297bc08cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--OptimisticLocking \
perl-DBIx-Class-OptimisticLocking"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBIx--Class"

inherit rpm
