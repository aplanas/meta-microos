SUMMARY = "Provide information on conflicts for Module::Runtime"
DESCRIPTION = "This module provides conflicts checking for Module::Runtime, which had a \
recent release that broke some versions of Moose. It is called from \
Moose::Conflicts and 'moose-outdated'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.003"

RPM_NAME = "perl-Module-Runtime-Conflicts-0.003-1.23.noarch.rpm"
RPM_HASH = "99981d069a4bd9c0d02fd18e92fa5eeaad882e4b027e3daa47008133fa8fd2d595a9a4b0af7f81a52d417b702ce663f02f59128056f803fc883bfa64c885ea74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Runtime--Conflicts \
perl-Module-Runtime-Conflicts"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Dist--CheckConflicts \
perl-Module--Runtime"

inherit rpm
