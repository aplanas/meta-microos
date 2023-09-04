SUMMARY = "Basic method declarations with signatures, without source filters"
DESCRIPTION = "Basic method declarations with signatures, without source filters"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Method-Signatures-Simple-1.07-1.27.noarch.rpm"
RPM_HASH = "33d2c7a4afbe3983a0a0cec487f9439830c45ffda811651e6006836071fad01e0874aea45a1d430bb7bb5867a6bfc93cb3b2ab0b69e2d5762bb3799341854f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Method--Signatures--Simple \
perl-Method-Signatures-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Devel--Declare"

inherit rpm
