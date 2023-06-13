SUMMARY = "Convert byte count to human readable format"
DESCRIPTION = "THIS IS ALPHA SOFTWARE: THE DOCUMENTATION AND THE CODE WILL SUFFER CHANGES \
SOME DAY (THANKS, GOD!). \
 \
This module provides a formatter which turns byte counts to usual readable \
format, like '2.0K', '3.1G', '100B'. It was inspired in the '-h' option of \
Unix utilities like 'du', 'df' and 'ls' for 'human-readable' output."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Number-Bytes-Human-0.11-1.8.noarch.rpm"
RPM_HASH = "69fb62e00503b6d53ae1b6a26cb00981e08a65fd136bce58308a7062885ba6b67cfc3ba46d8e246b286aea97bb2893805f986aabcc7484b1439320e4ef2b21d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Number::Bytes::Human) \
perl-Number-Bytes-Human"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
