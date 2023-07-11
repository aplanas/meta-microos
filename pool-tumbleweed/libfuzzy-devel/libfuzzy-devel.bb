SUMMARY = "API for ssdeep"
DESCRIPTION = "Devel API for ssdeep, the primary library is libfuzzy.*"
LICENSE = "GPL-2.0 & GPL-2.0+"

PV = "2.14.1"

RPM_NAME = "libfuzzy-devel-2.14.1-1.24.aarch64.rpm"
RPM_HASH = "ca5784cd6921427aad789222e7a18e0a6bb12ec5ddede23b52d57601d1c6281523d1638464bceb11b5985499691572a9f6e87dac8416e3a6d47789960187f39a"

RPROVIDES:${PN} += "libfuzzy-devel"

RDEPENDS:${PN} += "libfuzzy2"

inherit rpm
