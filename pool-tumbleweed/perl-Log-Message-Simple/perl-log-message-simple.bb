SUMMARY = "Simplified interface to Log::Message"
DESCRIPTION = "This module provides standardized logging facilities using the \
'Log::Message' module."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-Log-Message-Simple-0.10-3.28.noarch.rpm"
RPM_HASH = "3095ebec95b28859cd967744ceebf59344f7a48c59e48caed0dd191b9cca4d0e93d1ee9eccafb5f91647462f115e6bf00e957a431e15688531012b0d2dd20976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Log--Message--Simple \
perl-Log-Message-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Log--Message"

inherit rpm
