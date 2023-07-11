SUMMARY = "Syntax sugar for transactional methods"
DESCRIPTION = "This method exports the 'transactional' declarator that will enclose the \
method in a txn_do call."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-MooseX-TransactionalMethods-0.009-2.20.noarch.rpm"
RPM_HASH = "60a0033341b1d978f08f59da9c7812583d7c4237e8f95bc618c3ff297861a759c2ed9f44ed5a52ecaa094f013933c4df3f5cdfdde396e5a4646a92749d52abfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Meta--Method--Transactional \
perl-MooseX--Meta--Method--Transactional--Application--ToClass \
perl-MooseX--Meta--Method--Transactional--Application--ToComposite \
perl-MooseX--Meta--Method--Transactional--Application--ToInstance \
perl-MooseX--Meta--Method--Transactional--Meta--Role \
perl-MooseX--TransactionalMethods \
perl-MooseX-TransactionalMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-Sub--Name \
perl-aliased"

inherit rpm
