SUMMARY = "Simple role to provide a standard param method"
DESCRIPTION = "This is a very simple Moose role which provides a the CGI manpage like \
'param' method. \
 \
I found that I had written this code over and over and over and over again, \
and each time it was the same. So I thought, why not put it in a role?"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-Param-0.02-9.25.noarch.rpm"
RPM_HASH = "84807e32cc12a42a49ef624305ac67725282d9fbd7cddde94c0d0d11c579c2da7333e5456aee31bde67d91fe0714ce915467e533442ed5ddd1cd84ae1065b8cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Param \
perl-MooseX-Param"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Moose"

inherit rpm
