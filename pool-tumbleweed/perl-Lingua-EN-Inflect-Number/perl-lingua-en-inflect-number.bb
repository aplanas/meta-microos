SUMMARY = "Force number of words to singular or plural"
DESCRIPTION = "This module extends the functionality of Lingua::EN::Inflect with three new \
functions available for export:"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.12"

RPM_NAME = "perl-Lingua-EN-Inflect-Number-1.12-1.27.noarch.rpm"
RPM_HASH = "4dce25d0d8d38ad732e1d4b62de626e171cdd74f1be560cef1d69b3eb54f962a1c7cacd6478bd3377a002dbe18aadaf724affa36e22fd682aa72bfe79d422644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Inflect--Number \
perl-Lingua-EN-Inflect-Number"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Lingua--EN--Inflect"

inherit rpm
