SUMMARY = "Development files for snobol4"
DESCRIPTION = "Development files for snobol4."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "snobol4-devel-2.3.1-1.1.aarch64.rpm"
RPM_HASH = "2ac5fe2dcab64b1cf7f0a7311de89a41f2dd507901c3f8367efb60c9855a7c99d1117c6fd6c6fb0bfa5c68718790301fb062f14a7ccab97b6210c75c23d4ed04"

RPROVIDES:${PN} += "snobol4-devel"

RDEPENDS:${PN} += "snobol4"

inherit rpm
