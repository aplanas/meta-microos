SUMMARY = "Syntax sugar for authorized methods"
DESCRIPTION = "This method exports the 'authorized' declarator that makes a verification \
if the user has the required permissions before the acual invocation. The \
default verification method will take the 'user' method result and call \
'roles' to list the roles given to that user."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-MooseX-AuthorizedMethods-0.006-11.3.noarch.rpm"
RPM_HASH = "574adee1fe3da0f87a01e6603f85b2e77e4648cbe15150719dd3a47c8ad3b6e702931b3050d05d9b7da755d2972f957cbb205a44799e081ffeb6079c14479112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--AuthorizedMethods \
perl-MooseX--Meta--Method--Authorized \
perl-MooseX--Meta--Method--Authorized--Application--ToClass \
perl-MooseX--Meta--Method--Authorized--Application--ToComposite \
perl-MooseX--Meta--Method--Authorized--Application--ToInstance \
perl-MooseX--Meta--Method--Authorized--CheckRoles \
perl-MooseX--Meta--Method--Authorized--Meta--Role \
perl-MooseX-AuthorizedMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose \
perl-aliased"

inherit rpm
