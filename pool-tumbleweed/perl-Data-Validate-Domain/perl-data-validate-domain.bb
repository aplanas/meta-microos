SUMMARY = "Domain and host name validation"
DESCRIPTION = "This module offers a few subroutines for validating domain and host names."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Data-Validate-Domain-0.15-1.10.noarch.rpm"
RPM_HASH = "bd16bbb9fd492dc3cab8bd5fe67c4e9c5db6d77bd3c135526d40e69ef1b281edbcddf28869bd464b298fa994d6030f6f17bbdc3c321b61945b035f3bfb195ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Validate--Domain \
perl-Data-Validate-Domain"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Net--Domain--TLD"

inherit rpm
