SUMMARY = "Information about Perl modules"
DESCRIPTION = "Module::Info gives you information about Perl modules *without actually \
loading the module*. It actually isn't specific to modules and should work \
on any perl code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.37"

RPM_NAME = "perl-Module-Info-0.37-1.26.noarch.rpm"
RPM_HASH = "ce31ae00c506a333f1e5713d55f9578c06265efe837159ae77733f8415f0445f051107aad2ed2919d6628e2d125c250c821d72560a69802e0d9d897304f87419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Module--Info \
perl-Module--Info \
perl-Module--Info---version \
perl-Module--Info--Safe \
perl-Module--Info--Unsafe \
perl-Module-Info"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-B--Utils"

inherit rpm
