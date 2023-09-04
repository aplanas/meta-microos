SUMMARY = "Information about Perl modules"
DESCRIPTION = "Module::Info gives you information about Perl modules *without actually \
loading the module*. It actually isn't specific to modules and should work \
on any perl code."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.37"

RPM_NAME = "perl-Module-Info-0.37-1.27.noarch.rpm"
RPM_HASH = "d7af0f7a2eace912e6e0bebdbcc2df357e7aaaf9c9170d4784812e4a429e7c75bb049dcb51b627072a2fae8d4da44852034928b975db3813c80a1a2abbc30fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Module--Info \
perl-Module--Info \
perl-Module--Info---version \
perl-Module--Info--Safe \
perl-Module--Info--Unsafe \
perl-Module-Info"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-B--Utils"

inherit rpm
