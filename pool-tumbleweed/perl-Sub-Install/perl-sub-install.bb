SUMMARY = "Install subroutines into packages easily"
DESCRIPTION = "This module makes it easy to install subroutines into packages without the \
unsightly mess of 'no strict' or typeglobs lying about where just anyone \
can see them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.929"

RPM_NAME = "perl-Sub-Install-0.929-1.2.noarch.rpm"
RPM_HASH = "3eae6aa19c0e13318a229c030bf75e80cefec23dd64b98254501e8b16dde649101cc5384f990ff5f4432b362752b9c2aba8fe7586cc8acb41f0cadc34f0919ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Install \
perl-Sub-Install"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
