SUMMARY = "Domain and host name validation"
DESCRIPTION = "This module offers a few subroutines for validating domain and host names."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Data-Validate-Domain-0.15-1.11.noarch.rpm"
RPM_HASH = "2fe364d9627309e457aa9bfab0ea19c1bead4cee1af41fe4c8185e308747af19839ed07fee6a7f2f810af8cdaef39fe8eb19d61941ad8092978b6638ab706e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Validate--Domain \
perl-Data-Validate-Domain"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Net--Domain--TLD"

inherit rpm
