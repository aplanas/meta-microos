SUMMARY = "Simple Eyecandy ASCII Tables"
DESCRIPTION = "Simple eyecandy ASCII tables."
LICENSE = "Artistic-2.0"

PV = "2.07"

RPM_NAME = "perl-Text-SimpleTable-2.07-1.11.noarch.rpm"
RPM_HASH = "dcb22776b2d4e081fd97d1d585609350dc747cf84a35573b33fd2bb7b145983a2014ec9da9ab6f4c9f23d0b7871c3ff2c8da53e7340c84fe4f409bee423333bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SimpleTable \
perl-Text-SimpleTable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
