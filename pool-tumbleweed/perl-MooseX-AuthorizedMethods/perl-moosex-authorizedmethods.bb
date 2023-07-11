SUMMARY = "Syntax sugar for authorized methods"
DESCRIPTION = "This method exports the 'authorized' declarator that makes a verification \
if the user has the required permissions before the acual invocation. The \
default verification method will take the 'user' method result and call \
'roles' to list the roles given to that user."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-MooseX-AuthorizedMethods-0.006-11.2.noarch.rpm"
RPM_HASH = "0cf3e0109d8e67cddb3d07baa98012a3d6d75cfbd11a0d555c47465a287f3c5d42f314b3411b29719e9fdeb210f6e2cc660091b4b79a3561cefae6a34fd9e147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--AuthorizedMethods \
perl-MooseX--Meta--Method--Authorized \
perl-MooseX--Meta--Method--Authorized--Application--ToClass \
perl-MooseX--Meta--Method--Authorized--Application--ToComposite \
perl-MooseX--Meta--Method--Authorized--Application--ToInstance \
perl-MooseX--Meta--Method--Authorized--CheckRoles \
perl-MooseX--Meta--Method--Authorized--Meta--Role \
perl-MooseX-AuthorizedMethods"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose \
perl-aliased"

inherit rpm
