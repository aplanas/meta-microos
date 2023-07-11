SUMMARY = "Check the correct line endings in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of windows line endings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-EOL-2.02-1.12.noarch.rpm"
RPM_HASH = "77d85aa0cc0da67fa29af038b5af6cc457b48a8f529751647014719f75be9e3f2128a4693b036d8be753d49a1a84431ab7da8f5e93f7194806d6d44bc7613d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--EOL \
perl-Test-EOL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
