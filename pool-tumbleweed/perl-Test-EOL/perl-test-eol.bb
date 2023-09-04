SUMMARY = "Check the correct line endings in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of windows line endings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-EOL-2.02-1.13.noarch.rpm"
RPM_HASH = "4790b51bf2052a430901bdc5548854fb8da821c0c255d2e1c8213377d21fbf23a2f2b969283b6d7e0173b90a11dd082dc6886ba0fccc2f5b75826eb85fd30ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--EOL \
perl-Test-EOL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
