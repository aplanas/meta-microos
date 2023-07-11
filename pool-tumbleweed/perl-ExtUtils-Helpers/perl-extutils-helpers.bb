SUMMARY = "Various portability utilities for module builders"
DESCRIPTION = "This module provides various portable helper functions for module building \
modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.026"

RPM_NAME = "perl-ExtUtils-Helpers-0.026-1.24.noarch.rpm"
RPM_HASH = "f9a3029c5c50529b05ea5d5d6429897b38e823e64829db8b0ab5c04e6eba32b4741a90ed7097dc68470ad861d991f91f623106430c4676777565b2bd88bff6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Helpers \
perl-ExtUtils--Helpers--Unix \
perl-ExtUtils--Helpers--VMS \
perl-ExtUtils--Helpers--Windows \
perl-ExtUtils-Helpers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
