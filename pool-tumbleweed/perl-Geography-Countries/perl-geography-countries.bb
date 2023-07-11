SUMMARY = "2-letter, 3-letter, and numerical codes for countries"
DESCRIPTION = "This module maps country names, and their 2-letter, 3-letter and numerical \
codes, as defined by the ISO-3166 maintenance agency [1], and defined by \
the UNSD."
LICENSE = "MIT"

PV = "2009041301"

RPM_NAME = "perl-Geography-Countries-2009041301-1.27.noarch.rpm"
RPM_HASH = "b3478c6c86236fb115bf8ff7f8e85fbdcedbada8485281e1c26704ace2687b3c21cddfa792ebc32be0143828945d49a593d6185168ada1b6c42af8e13f9a0d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geography--Countries \
perl-Geography-Countries"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
