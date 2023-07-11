SUMMARY = "Simplified interface to Log::Message"
DESCRIPTION = "This module provides standardized logging facilities using the \
'Log::Message' module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Log-Message-Simple-0.10-3.27.noarch.rpm"
RPM_HASH = "adda5716505f9031b5c271e104669022288d79b1bb313bb9e1361e1dcd2a243e4cea5c3fd074f57ecd59cf691d4a29548cd39369e88f15846eca4005b7ee92ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Message--Simple \
perl-Log-Message-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Log--Message"

inherit rpm
