SUMMARY = "2-letter, 3-letter, and numerical codes for countries"
DESCRIPTION = "This module maps country names, and their 2-letter, 3-letter and numerical \
codes, as defined by the ISO-3166 maintenance agency [1], and defined by \
the UNSD."
LICENSE = "MIT"

PV = "2009041301"

RPM_NAME = "perl-Geography-Countries-2009041301-1.28.noarch.rpm"
RPM_HASH = "9cba6965202dd9929bcadfae9f74dd97a16421fff37eee7a2b4fe91ead8bb831720e59d04a757a2309d0b9f736564909d870d55898d899cfd8dddb953170023a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Geography--Countries \
perl-Geography-Countries"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
