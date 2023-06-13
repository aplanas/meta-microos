SUMMARY = "2-letter, 3-letter, and numerical codes for countries"
DESCRIPTION = "This module maps country names, and their 2-letter, 3-letter and numerical \
codes, as defined by the ISO-3166 maintenance agency [1], and defined by \
the UNSD."
LICENSE = "MIT"

PV = "2009041301"

RPM_NAME = "perl-Geography-Countries-2009041301-1.26.noarch.rpm"
RPM_HASH = "2f7ac8ab84914d0e36246e23fde004e06b714f4d92d3ac5908549c579290484fb6d3f1e7217263ee0c7bf1458cc01f6c96eabe144bdd3cf246a54b47c7f9d703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Geography::Countries) \
perl-Geography-Countries"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
