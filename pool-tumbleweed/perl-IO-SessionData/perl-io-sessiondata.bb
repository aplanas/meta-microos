SUMMARY = "Supporting module for SOAP::Lite"
DESCRIPTION = "supporting module for SOAP::Lite"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-IO-SessionData-1.03-3.29.noarch.rpm"
RPM_HASH = "9b2430f71e9703fc0777910e152f6037ae0de6051502c4a9d3e20005c280282a371fff8beae6524a5c94a21536fa179cbfa7cd642bf826f536f33442807cecc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IO--SessionData \
perl-IO--SessionSet \
perl-IO-SessionData"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
