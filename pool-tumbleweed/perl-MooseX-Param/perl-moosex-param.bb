SUMMARY = "Simple role to provide a standard param method"
DESCRIPTION = "This is a very simple Moose role which provides a the CGI manpage like \
'param' method. \
 \
I found that I had written this code over and over and over and over again, \
and each time it was the same. So I thought, why not put it in a role?"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-MooseX-Param-0.02-9.26.noarch.rpm"
RPM_HASH = "47ae80b7a9e54a39f4d57649997e6114ff7e0d6095168191ab7774defb149cc07236c74fb37aab2cf6eb00d4c1bbe1283fb05b99ea67759dc1f7d76bb31c79db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Param \
perl-MooseX-Param"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Moose"

inherit rpm
