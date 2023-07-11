SUMMARY = "Development files for snobol4"
DESCRIPTION = "Development files for snobol4."
LICENSE = "BSD-2-Clause"

PV = "2.3.1"

RPM_NAME = "snobol4-devel-2.3.1-2.1.aarch64.rpm"
RPM_HASH = "49588b60da71f2cdb66707ab45108030759dba6089f7c64debb958a2fb744ac18a0166345cb013e4a51ca0bf3bfbd3549bd6a1064f738e7118bf5c53f4853798"

RPROVIDES:${PN} += "snobol4-devel"

RDEPENDS:${PN} += "snobol4"

inherit rpm
