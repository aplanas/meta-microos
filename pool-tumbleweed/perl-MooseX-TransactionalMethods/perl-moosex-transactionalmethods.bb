SUMMARY = "Syntax sugar for transactional methods"
DESCRIPTION = "This method exports the 'transactional' declarator that will enclose the \
method in a txn_do call."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-MooseX-TransactionalMethods-0.009-2.21.noarch.rpm"
RPM_HASH = "1922282ea95c4734efa6d17c728b41a1a386b2e4f86a32d3c89f8693e900d32037a4d54038cbff98d2d0c76f36e4dbf8407f6a9559355ca2604119ac3bb2c116"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Meta--Method--Transactional \
perl-MooseX--Meta--Method--Transactional--Application--ToClass \
perl-MooseX--Meta--Method--Transactional--Application--ToComposite \
perl-MooseX--Meta--Method--Transactional--Application--ToInstance \
perl-MooseX--Meta--Method--Transactional--Meta--Role \
perl-MooseX--TransactionalMethods \
perl-MooseX-TransactionalMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-Sub--Name \
perl-aliased"

inherit rpm
