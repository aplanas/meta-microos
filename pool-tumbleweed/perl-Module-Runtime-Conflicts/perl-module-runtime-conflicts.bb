SUMMARY = "Provide information on conflicts for Module::Runtime"
DESCRIPTION = "This module provides conflicts checking for Module::Runtime, which had a \
recent release that broke some versions of Moose. It is called from \
Moose::Conflicts and 'moose-outdated'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-Module-Runtime-Conflicts-0.003-1.24.noarch.rpm"
RPM_HASH = "aa239ba553020b6dcb8e5bfd715c7de043e904402bb391f0d3fbe4aa534fbe9762ccf7acc0e1702e6324ac5053bcf784e571a650acfe7da147d3615ad8d8f34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Runtime--Conflicts \
perl-Module-Runtime-Conflicts"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Dist--CheckConflicts \
perl-Module--Runtime"

inherit rpm
