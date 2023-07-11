SUMMARY = "Install subroutines into packages easily"
DESCRIPTION = "This module makes it easy to install subroutines into packages without the \
unsightly mess of 'no strict' or typeglobs lying about where just anyone \
can see them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.929"

RPM_NAME = "perl-Sub-Install-0.929-1.3.noarch.rpm"
RPM_HASH = "5155a7c6c528d6e1f31c920a357de1e931196a1b1e64cc7bac24f1af342a03eb06d88c6986b9c1ab8bb563de1e90cc9f2486c3cc1dcfb4185d2e3bdf985eb460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Install \
perl-Sub-Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
