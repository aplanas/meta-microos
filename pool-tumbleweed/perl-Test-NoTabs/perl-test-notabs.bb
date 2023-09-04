SUMMARY = "Check the presence of tabs in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of tabs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-NoTabs-2.02-1.19.noarch.rpm"
RPM_HASH = "0ce9ca8cd0f17c40bd07ebe864fbb2e4c25b2f41645e3e601859b6040331b516143e850bc4b09e4932e3702eb9d89de2afe3828828e79fc024ecdb62e9a30419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--NoTabs \
perl-Test-NoTabs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
